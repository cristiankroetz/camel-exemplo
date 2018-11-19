package br.com.camel.exemplo;



import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

//@Component
public class Route5 extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		onException(Exception.class)
		.log(LoggingLevel.ERROR, "Deu Erro ao mover o arquivo")
		.logStackTrace(true)
		.end();
		
		
		from("file://./DiretorioArquivos/Origem/rota5?delete=true&moveFailed=error_directory")
			.routeId("rota5")
			.log("Rota5--------------------------------------------------")
			.split().tokenize("\n", 1)
			.to("log:?level=INFO&showBody=true")
			.to("activemq:queue:rota5.fila.1");
		
		restConfiguration().host("localhost").port(8081).contextPath("api");
		from("activemq:queue:rota5.fila.1")
			.routeId("rota5_rest")
			.to("log:?level=INFO&showBody=true")
			.setHeader("Accept", simple(MediaType.ALL_VALUE))
			.to("rest:post:/api/rest/entrada");
	}
}