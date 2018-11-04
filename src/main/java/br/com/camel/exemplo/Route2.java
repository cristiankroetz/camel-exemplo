package br.com.camel.exemplo;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.GenericFile;
import org.springframework.stereotype.Component;

@Component
public class Route2 extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		from("file://./DiretorioArquivos/Origem/rota2?delete=true")
		.process(new Processor() {
			  public void process(Exchange exchange) throws Exception {
			    GenericFile<File> body =  (GenericFile<File>) exchange.getIn().getBody();
			    BufferedWriter writer = new BufferedWriter(new FileWriter(body.getFile()));
			    writer.write ("novo texto");

			    writer.close();
			    //Correto Usar o Out
			  }
			})
		.log("Rota2--------------------------------------------------")
		.to("file://./DiretorioArquivos/Destino/");
	}
}