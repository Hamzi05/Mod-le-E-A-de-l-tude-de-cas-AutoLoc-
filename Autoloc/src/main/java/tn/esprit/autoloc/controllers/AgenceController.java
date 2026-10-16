package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.services.IAgenceService;

import java.util.List;

@RestController
@RequestMapping("/Agences")
@AllArgsConstructor
public class AgenceController {

    private final IAgenceService agenceService;

    @PostMapping("/ajouterAgence")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceService.addAgence(agence);
    }

    @GetMapping("/allAgences")
    public List<Agence> getAllAgences() {
        return agenceService.getAllAgences();
    }

    @GetMapping("/getAgence/{id}")
    public Agence getAgenceById(@PathVariable Long id) {
        return agenceService.getAgenceById(id);
    }

    @PutMapping("/modifierAgence")
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    @DeleteMapping("/supprimerAgence/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.deleteAgence(id);
    }
}
