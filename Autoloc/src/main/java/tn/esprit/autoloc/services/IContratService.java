package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Contrat;

import java.util.List;

public interface IContratService {

    Contrat addContrat(Contrat contrat);

    List<Contrat> getAllContrats();

    Contrat updateContrat(Contrat contrat);

    void deleteContrat(Long idContrat);
}