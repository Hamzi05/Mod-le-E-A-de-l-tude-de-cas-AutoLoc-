package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Equipement;

import java.util.List;

public interface IEquipementService {

    Equipement addEquipement(Equipement equipement);

    List<Equipement> getAllEquipements();

    Equipement updateEquipement(Equipement equipement);

    void deleteEquipement(Long idEquipement);
}