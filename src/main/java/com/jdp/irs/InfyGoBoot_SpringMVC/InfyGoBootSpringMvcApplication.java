package com.jdp.irs.InfyGoBoot_SpringMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = { "classpath:configuration.properties" })
public class InfyGoBootSpringMvcApplication {
	public static void main(String[] args) {
		SpringApplication.run(InfyGoBootSpringMvcApplication.class, args);
	}
}