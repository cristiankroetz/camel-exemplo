package br.com.camel.exemplo;



import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class Route4 extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("activemq:queue:rota4.fila.1")
		.routeId("rota4")
        .to("log:?level=INFO&showBody=true")
        .to("activemq:queue:rota4.fila.2");

	}
}