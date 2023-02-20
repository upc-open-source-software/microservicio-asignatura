package com.upc.instituto.asignatura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicioAsignaturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAsignaturaApplication.class, args);
	}

}
