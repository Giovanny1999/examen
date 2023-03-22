package mx.examen.aplicacionrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//Clase que ejecuta toda la Aplicacion con sus anotaciones de scanner para verificar los beans de los demas paquetes
@SpringBootApplication
@ComponentScan(basePackages = "mx.examen")
@EntityScan("mx.examen.entity")
@EnableJpaRepositories("mx.examen.repository")
public class AplicacionrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacionrestApplication.class, args);
	}

}
