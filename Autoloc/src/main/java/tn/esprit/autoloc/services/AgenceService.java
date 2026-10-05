package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.repositories.AgenceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {

    private AgenceRepository agenceRepository;


    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }


    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }

    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }


    public void deleteAgence(Long idAgence) {
        agenceRepository.deleteById(Math.toIntExact(idAgence));
    }
}