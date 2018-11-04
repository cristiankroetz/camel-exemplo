package br.com.camel.exemplo;



import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route8 extends RouteBuilder {

	@Override
	public void configure() throws Exception {
//		from("timer:foo").to("log:bar");
//		from("imaps://imap.gmail.com?username=cristian.kroetz@gmail.com"
//                + "&password=wim06*ue*"
//                + "&deleteProcessedMessages=false"
//                + "&processOnlyUnseenMessages=true"
//                + "&consumer.delay=600000")
//		.choice().when(header("subject").contains("Test-Camel"))
//		.to("log:bar");
//		from("file://./DiretorioArquivos/Origem/rota2?delete=true")
//		.process(new Processor() {
//			  public void process(Exchange exchange) throws Exception {
//			    GenericFile<File> body =  (GenericFile<File>) exchange.getIn().getBody();
//			    BufferedWriter writer = new BufferedWriter(new FileWriter(body.getFile()));
//			    writer.write ("novo texto");
//
//			    writer.close();
//			    //Coretto Usar o Out
//			  }
//			})
//		.log("Rota2--------------------------------------------------")
//		.to("file://./DiretorioArquivos/Destino/");
	}
}