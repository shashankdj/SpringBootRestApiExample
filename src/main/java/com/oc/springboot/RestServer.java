package com.oc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.oc.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class RestServer {

	public static void main(String[] args) {
		SpringApplication.run(RestServer.class, args);
	}
}
