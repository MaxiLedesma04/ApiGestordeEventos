package Minhub.APiGestiondeEventos.repositories;

import Minhub.APiGestiondeEventos.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
