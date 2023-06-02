package co.edu.uco.evoc.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.uco.evoc"})
public class EvocApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvocApiApplication.class, args);
	}

}
