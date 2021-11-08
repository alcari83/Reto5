package Reto5;

//1. Modelo

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//2. Interface
//3. Repositorio
//4. Servicios
//5. Controlador o Web

// Categoria, Cabaña,Cliente,Mensaje y Reservacion

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"Reto5.Modelo"})
public class Reto5Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto5Application.class, args);
	}

}
