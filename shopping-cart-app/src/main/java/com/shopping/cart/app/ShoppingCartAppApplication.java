package com.shopping.cart.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ShoppingCartAppApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
	
}
