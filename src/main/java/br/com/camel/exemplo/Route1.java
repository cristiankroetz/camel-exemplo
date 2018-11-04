package br.com.camel.exemplo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route1 extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file://./DiretorioArquivos/Origem/rota1/?delete=true")
		.log("Rota1 --------------------------------------------------")
		.to("file://./DiretorioArquivos/Destino/");
	}
}