
package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.repositories.AgenceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {

    private final AgenceRepository agenceRepository;

    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence getAgenceById(Long idAgence) {
        return agenceRepository.findById(idAgence).orElse(null);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long idAgence) {
        agenceRepository.deleteById(idAgence);
    }
}
