package tn.esprit.autoloc.services;

import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entities.Agence;

import java.util.List;

public interface IAgenceService {

    Agence addAgence(Agence agence);

    List<Agence> getAllAgences();

    Agence updateAgence(Agence agence);

    void deleteAgence(Long idAgence);
}