package com.aboud.ProductSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);


		ProductService service = context.getBean(ProductService.class);
        String name = "BlackBeast";
		List<Product> products = service.getAllProducts(name);
		for(Product p : products) {
			System.out.println(p);
		}
	}

}
