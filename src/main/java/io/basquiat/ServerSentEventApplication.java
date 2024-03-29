package io.basquiat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

/**
 * 
 * created by basquiat
 * 
 */
@EnableWebFlux
@SpringBootApplication
public class ServerSentEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerSentEventApplication.class, args);
	}

}
