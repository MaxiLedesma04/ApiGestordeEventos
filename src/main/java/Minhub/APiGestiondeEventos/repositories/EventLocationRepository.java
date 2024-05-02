package Minhub.APiGestiondeEventos.repositories;

import Minhub.APiGestiondeEventos.models.EventLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventLocationRepository extends JpaRepository<EventLocation, Long> {
}
