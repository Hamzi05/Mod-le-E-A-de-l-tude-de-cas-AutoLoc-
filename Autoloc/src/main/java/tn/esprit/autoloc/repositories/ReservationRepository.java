package tn.esprit.autoloc.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.entities.Vehicule;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long>{
}
