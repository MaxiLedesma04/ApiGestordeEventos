package Minhub.APiGestiondeEventos;

import Minhub.APiGestiondeEventos.models.Customer;
import Minhub.APiGestiondeEventos.models.CustomerGender;
import Minhub.APiGestiondeEventos.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class APiGestiondeEventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(APiGestiondeEventosApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(CustomerRepository customerRepository, EventRepository eventRepository, LocationRepository locationRepository, EventLocationRepository eventLocationRepository, CommentRepository CommentRepository) {
		return (args) -> {
			Customer customer1 = new Customer("Maximiliano", "Lopez", "Max@gmail.com", true, 25, CustomerGender.MALE);
			customerRepository.save(customer1);
			Customer customer2 = new Customer("Juan", "Perez", "Juancho@gmail.com", true, 25, CustomerGender.MALE);
			customerRepository.save(customer2);
		};
	}
}
