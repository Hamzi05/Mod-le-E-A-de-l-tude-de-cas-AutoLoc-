package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Vehicule; // Assuming your entity is named Vehicle
import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {

    Vehicule addVehicle(Vehicule vehicle);

    List<Vehicule> getAllVehicles();

    Vehicule updateVehicle(Vehicule vehicle);

    void deleteVehicle(Long idVehicle);
}