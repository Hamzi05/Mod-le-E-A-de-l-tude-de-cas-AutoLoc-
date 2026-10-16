
package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Maintenance;
import tn.esprit.autoloc.services.IMaintenanceService;

import java.util.List;

@RestController
@RequestMapping("/maintenances")
@AllArgsConstructor
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    @PostMapping("/ajouterMaintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.addMaintenance(maintenance);
    }

    @GetMapping("/allMaintenances")
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.getAllMaintenances();
    }

    @PutMapping("/modifierMaintenance")
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceService.updateMaintenance(maintenance);
    }

    @DeleteMapping("/supprimerMaintenance/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        maintenanceService.deleteMaintenance(id);
    }
}
