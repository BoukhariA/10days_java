package com.aboud.ProductSpringWEB;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ProductSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductSpringWebApplication.class, args);
	}


	@Value("${allowed.origin}")
	private String allowedOrigin;

	@Bean
	public WebMvcConfigurer corsConfigurer()
	{
		return new WebMvcConfigurer() {
		@Override
			public void addCorsMappings(CorsRegistry registry){
			registry.addMapping("/**")
					.allowedOrigins("*")
					.allowedMethods("GET", "POST", "PUT", "DELETE")
					.allowedHeaders("*");

		}
		};
	}
}
