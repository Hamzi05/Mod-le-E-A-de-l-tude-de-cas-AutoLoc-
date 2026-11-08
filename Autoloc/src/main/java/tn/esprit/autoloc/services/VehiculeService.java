package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.repositories.AgenceRepository;
import tn.esprit.autoloc.repositories.VehiculeRepository;
import tn.esprit.autoloc.repositories.EquipementRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {

    private final VehiculeRepository vehiculeRepository;
    private final AgenceRepository agenceRepository;
    private final EquipementRepository equipementRepository;

    @Override
    public Vehicule addVehicle(Vehicule vehicle) {
        return vehiculeRepository.save(vehicle);
    }

    @Override
    public List<Vehicule> getAllVehicles() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule updateVehicle(Vehicule vehicle) {
        return vehiculeRepository.save(vehicle);
    }

    @Override
    public void deleteVehicle(Long idVehicle) {
        vehiculeRepository.deleteById(idVehicle);
    }

    @Override
    @Transactional
    public void affecterVehiculeAAgence(Long idVehicule, Long idAgence) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Véhicule introuvable"));

        Agence agence = agenceRepository.findById(idAgence)
                .orElseThrow(() -> new RuntimeException("Agence introuvable"));

        vehicule.setAgence(agence);
        vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public void desaffecterVehiculeDAgence(Long idVehicule) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Véhicule introuvable"));

        vehicule.setAgence(null);
        vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public void affecterEquipementAVehicule(Long idEquipement, Long idVehicule) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Véhicule introuvable"));

        Equipement equipement = equipementRepository.findById(idEquipement)
                .orElseThrow(() -> new RuntimeException("Équipement introuvable"));

        // On initialise la liste si elle est nulle
        if (vehicule.getEquipements() == null) {
            vehicule.setEquipements(new ArrayList<>());
        }

        // On vérifie si l'équipement n'est pas déjà présent
        if (!vehicule.getEquipements().contains(equipement)) {
            vehicule.getEquipements().add(equipement);

            // Optionnel mais recommandé : mettre à jour la relation dans les deux sens
            if(equipement.getVehicules() != null && !equipement.getVehicules().contains(vehicule)){
                equipement.getVehicules().add(vehicule);
            }

            vehiculeRepository.save(vehicule);
        }
    }

    @Override
    @Transactional
    public void desaffecterEquipementDeVehicule(Long idEquipement, Long idVehicule) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Véhicule introuvable"));

        Equipement equipement = equipementRepository.findById(idEquipement)
                .orElseThrow(() -> new RuntimeException("Équipement introuvable"));

        if (vehicule.getEquipements() != null) {
            vehicule.getEquipements().remove(equipement);

            // Optionnel : retirer aussi de l'autre côté
            if(equipement.getVehicules() != null){
                equipement.getVehicules().remove(vehicule);
            }

            vehiculeRepository.save(vehicule);
        }
    }
}