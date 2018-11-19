package br.com.camel.exemplo;



import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route8 extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("github://pullRequest?repoOwner=cristiankroetz&repoName=camel-exemplo&username=cristiankroetz&password=*******")
			.routeId("rota 8")
				.process(new Processor() {
				  public void process(Exchange exchange) throws Exception {
				     exchange.getIn().getBody();
				  }
				})
				.to("log:novo request");
	}
}