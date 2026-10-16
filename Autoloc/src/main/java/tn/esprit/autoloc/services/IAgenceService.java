
package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Agence;
import java.util.List;

public interface IAgenceService {

    Agence addAgence(Agence agence);

    List<Agence> getAllAgences();

    Agence getAgenceById(Long idAgence);

    Agence updateAgence(Agence agence);

    void deleteAgence(Long idAgence);
}
