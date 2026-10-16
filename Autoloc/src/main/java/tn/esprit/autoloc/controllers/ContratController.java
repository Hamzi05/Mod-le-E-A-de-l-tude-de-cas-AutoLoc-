
package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.services.IContratService;

import java.util.List;

@RestController
@RequestMapping("/contrats")
@AllArgsConstructor
public class ContratController {

    private final IContratService contratService;

    @PostMapping("/ajouterContrat")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        return contratService.addContrat(contrat);
    }

    @GetMapping("/allContrats")
    public List<Contrat> getAllContrats() {
        return contratService.getAllContrats();
    }

    @PutMapping("/modifierContrat")
    public Contrat updateContrat(@RequestBody Contrat contrat) {
        return contratService.updateContrat(contrat);
    }

    @DeleteMapping("/supprimerContrat/{id}")
    public void deleteContrat(@PathVariable Long id) {
        contratService.deleteContrat(id);
    }
}
