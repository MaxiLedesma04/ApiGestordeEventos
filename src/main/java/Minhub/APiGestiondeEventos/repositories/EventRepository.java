package Minhub.APiGestiondeEventos.repositories;

import Minhub.APiGestiondeEventos.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
