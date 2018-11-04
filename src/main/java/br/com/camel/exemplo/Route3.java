package br.com.camel.exemplo;



import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route3 extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		onException(Exception.class)
		.log(LoggingLevel.ERROR, "Deu Erro ao mover o arquivo")
		.logStackTrace(true)
		.end();
		
		from("file://./DiretorioArquivos/Origem/rota3?delete=true&moveFailed=error_directory")
		.routeId("rota3")
		.process(new Processor() {
			  public void process(Exchange exchange) throws Exception {
				  exchange.getOut().getBody().toString();
			   
			  }
			})
		.log("Rota3--------------------------------------------------")
		.to("file://./DiretorioArquivos/Destino/");
	}
}