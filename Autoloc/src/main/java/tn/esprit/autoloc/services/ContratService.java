package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.repositories.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {

    private ContratRepository contratRepository;


    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }


    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }


    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }


    public void deleteContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);
    }
}