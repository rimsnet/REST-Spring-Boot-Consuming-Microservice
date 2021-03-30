package com.rimsan.springboot.mobile.microservice.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(value="com.rimsan.springboot.mobile.microservice.*")
@EnableSwagger2
public class SBMobileMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SBMobileMicroServiceApplication.class, args);
	}
   
	
	@Bean
	public Docket api() {                
	    return new Docket(DocumentationType.SWAGGER_2)          
	      .select()
	      .apis(RequestHandlerSelectors.basePackage("com.rimsan.springboot.mobile.microservice.controller"))
	      .build();
	}
	 
}
