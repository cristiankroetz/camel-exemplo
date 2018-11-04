package br.com.camel.exemplo;



import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class Route6 extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		restConfiguration().host("localhost").port(8081).contextPath("api");
		rest("/rest")
			.post("/entrada")
			.consumes(MediaType.ALL_VALUE)
			.produces(MediaType.ALL_VALUE)
			.route()
			.setHeader(Exchange.HTTP_RESPONSE_CODE,simple("200"))
			.to("activemq:queue:rota6.fila.1?disableReplyTo=true")//testar o end na rota , qual rota???
			.endRest()
			;
		
	}
}