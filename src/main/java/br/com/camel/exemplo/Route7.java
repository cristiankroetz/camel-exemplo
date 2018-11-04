package br.com.camel.exemplo;



import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route7 extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("activemq:queue:rota6.fila.1")
		.setHeader("CamelFileName", simple("FileRota7_${body}.txt"))
		.to("file://./DiretorioArquivos/Destino/");
	}
}