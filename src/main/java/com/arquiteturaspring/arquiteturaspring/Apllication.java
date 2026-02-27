package com.arquiteturaspring.arquiteturaspring;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Apllication {

	public static void main(String[] args) {
		SpringApplication.run(Apllication.class, args);
		/*
		* SpringApplicationBuilder builder = new SpringApplicationBuilder(Apllication.class);

		//builder.bannerMode(Banner.Mode.OFF);  // Desativa o banner "Spring" no console
		ConfigurableApplicationContext applicationContext = builder.context();
		//var produtoRepository = applicationContext.getBean("produtoRepository");

		builder.profiles("producao", "homogolacao");
		//builder.properties("spring.datasource.url=jdbc://");

		builder.run(args); // roda o projeto

		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String applicationName = environment.getProperty("spring.application.name");
		System.out.println("Nome da aplicação: " + applicationName);
		*
		*
		* */
	}

}
