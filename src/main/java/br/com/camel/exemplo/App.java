package br.com.camel.exemplo;

import org.apache.camel.spi.RestConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
	
    public static void main( String[] args )  {
    	SpringApplication.run(App.class, args);
    }
 
//    @Bean
//    public RestConfiguration getRest()
//    {
//        RestConfiguration restconfig=new RestConfiguration();
//        restconfig.setPort(8081);
////        restconfig.setComponent("restlet");
//        //restconfig.setHost("localhost");
//        restconfig.setContextPath("/api");
////        restconfig.setBindingMode("auto");
//        return restconfig;
//    }
    
}
