package com.example.jpa_projection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class JpaProjectionApplication {

	private final ProductRepository productRepository;

	public JpaProjectionApplication(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaProjectionApplication.class, args);


	}

	@Bean
	public CommandLineRunner loadData(){

		return args -> {

			productRepository.deleteAll();

			Product product1 = new Product();
			product1.setName("product1");
			product1.setDescription("description1");
			product1.setActive(true);

			Product product2 = new Product();
			product2.setName("product2");
			product2.setDescription("description2");
			product2.setActive(false);


			productRepository.saveAll(Arrays.asList(product1,product2));

		};

	}
}
