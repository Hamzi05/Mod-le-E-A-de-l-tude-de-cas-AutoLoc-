
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
}
