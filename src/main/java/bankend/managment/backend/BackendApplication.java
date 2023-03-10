package bankend.managment.backend;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("bankend.managment.backend.entities")
public class BackendApplication {

	public static void main(String[] args) {
		//ApplicationContext context = 
		SpringApplication.run(BackendApplication.class, args);
		
	}

}
