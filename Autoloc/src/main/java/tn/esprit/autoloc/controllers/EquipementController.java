
package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.services.IEquipementService;

import java.util.List;

@RestController
@RequestMapping("/equipements")
@AllArgsConstructor
public class EquipementController {

    private final IEquipementService equipementService;

    @PostMapping("/ajouterEquipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return equipementService.addEquipement(equipement);
    }

    @GetMapping("/allEquipements")
    public List<Equipement> getAllEquipements() {
        return equipementService.getAllEquipements();
    }

    @PutMapping("/modifierEquipement")
    public Equipement updateEquipement(@RequestBody Equipement equipement) {
        return equipementService.updateEquipement(equipement);
    }

    @DeleteMapping("/supprimerEquipement/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }
}
