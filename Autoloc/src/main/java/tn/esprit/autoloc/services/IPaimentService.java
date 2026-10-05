package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Paiment;

import java.util.List;

public interface IPaimentService {

    Paiment addPaiment(Paiment paiment);

    List<Paiment> getAllPaiments();

    Paiment updatePaiment(Paiment paiment);

    void deletePaiment(Long idPaiment);
}