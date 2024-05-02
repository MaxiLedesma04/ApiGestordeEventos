package Minhub.APiGestiondeEventos.repositories;

import Minhub.APiGestiondeEventos.models.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
