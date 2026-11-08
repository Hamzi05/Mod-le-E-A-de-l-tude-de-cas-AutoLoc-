package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.services.IVehiculeService;

import java.util.List;

@RestController
@RequestMapping("/vehicules")
@AllArgsConstructor
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @PostMapping("/ajouterVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicle(vehicule);
    }

    @GetMapping("/allVehicules")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicles();
    }

    @PutMapping("/modifierVehicule")
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicle(vehicule);
    }

    @DeleteMapping("/supprimerVehicule/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.deleteVehicle(id);
    }

    // ==========================================
    // NOUVELLES ROUTES D'AFFECTATION
    // ==========================================

    @PutMapping("/affecterAgence/{idVehicule}/{idAgence}")
    public void affecterVehiculeAAgence(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        vehiculeService.affecterVehiculeAAgence(idVehicule, idAgence);
    }

    @PutMapping("/desaffecterAgence/{idVehicule}")
    public void desaffecterVehiculeDAgence(@PathVariable Long idVehicule) {
        vehiculeService.desaffecterVehiculeDAgence(idVehicule);
    }

    @PutMapping("/affecterEquipement/{idVehicule}/{idEquipement}")
    public void affecterEquipementAVehicule(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        // Attention à l'ordre des paramètres dans ton service : (idEquipement, idVehicule)
        vehiculeService.affecterEquipementAVehicule(idEquipement, idVehicule);
    }

    @PutMapping("/desaffecterEquipement/{idVehicule}/{idEquipement}")
    public void desaffecterEquipementDeVehicule(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        vehiculeService.desaffecterEquipementDeVehicule(idEquipement, idVehicule);
    }
}