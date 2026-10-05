package tn.esprit.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Paiment;
@Repository
public interface PaimentRepository extends JpaRepository<Paiment,Long> {
}
