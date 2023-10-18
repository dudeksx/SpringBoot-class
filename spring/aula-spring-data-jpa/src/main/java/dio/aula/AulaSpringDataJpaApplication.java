package dio.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "dio.aula.model")
public class AulaSpringDataJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(AulaSpringDataJpaApplication.class, args);
	}
}
