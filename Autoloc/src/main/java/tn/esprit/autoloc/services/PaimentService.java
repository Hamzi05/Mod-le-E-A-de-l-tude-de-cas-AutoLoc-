
package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.entities.Paiment;

import tn.esprit.autoloc.repositories.ContratRepository;
import tn.esprit.autoloc.repositories.PaimentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PaimentService implements IPaimentService {

    private final PaimentRepository paimentRepository;
    private final ContratRepository contratRepository;

    // Ajouter un paiement
    @Override
    public Paiment addPaiment(Paiment paiment) {
        return paimentRepository.save(paiment);
    }

    // Afficher tous les paiements
    @Override
    public List<Paiment> getAllPaiments() {
        return paimentRepository.findAll();
    }

    // Modifier un paiement
    @Override
    public Paiment updatePaiment(Paiment paiment) {
        return paimentRepository.save(paiment);
    }

    // Supprimer un paiement
    @Override
    public void deletePaiment(Long idPaiment) {
        paimentRepository.deleteById(idPaiment);
    }

    // Affecter un paiement à un contrat
    @Override
    @Transactional
    public void affecterPaiementAContrat(Long idPaiement, Long idContrat) {

        Paiment paiment = paimentRepository.findById(idPaiement)
                .orElseThrow(() -> new RuntimeException("Paiement introuvable"));

        Contrat contrat = contratRepository.findById(idContrat)
                .orElseThrow(() -> new RuntimeException("Contrat introuvable"));

        paiment.setContrat(contrat);

        paimentRepository.save(paiment);
    }
}
