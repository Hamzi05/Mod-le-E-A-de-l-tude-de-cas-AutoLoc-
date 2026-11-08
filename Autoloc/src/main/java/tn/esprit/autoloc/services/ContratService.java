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
public class ContratService implements IContratService {

    private final ContratRepository contratRepository;
    private final PaimentRepository paiementRepository; // Ajouté pour l'affectation

    @Override
    public Contrat addContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);
    }

    @Override
    @Transactional
    public void affecterPaiementAContrat(Long idPaiement, Long idContrat) {
        Contrat contrat = contratRepository.findById(idContrat)
                .orElseThrow(() -> new RuntimeException("Contrat introuvable avec l'id : " + idContrat));

        Paiment paiment = paiementRepository.findById(idPaiement)
                .orElseThrow(() -> new RuntimeException("Paiement introuvable avec l'id : " + idPaiement));

        // Affectation du paiement au contrat
        paiment.setContrat(contrat);

        // Si la relation est bidirectionnelle (Paiement -> Contrat), on la met à jour aussi :
        // paiement.setContrat(contrat);

        contratRepository.save(contrat);
    }
}