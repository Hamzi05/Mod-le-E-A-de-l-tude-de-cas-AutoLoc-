package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.repositories.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {

    private VehiculeRepository vehiculeRepository;


    public Vehicule addVehicle(Vehicule vehicle) {
        return null;
    }


    public List<Vehicule> getAllVehicles() {
        return List.of();
    }


    public Vehicule updateVehicle(Vehicule vehicle) {
        return null;
    }


    public void deleteVehicle(Long idVehicle) {

    }
}