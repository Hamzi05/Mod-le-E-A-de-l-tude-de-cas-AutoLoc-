
package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Paiment;
import tn.esprit.autoloc.services.IPaimentService;

import java.util.List;

@RestController
@RequestMapping("/paiments")
@AllArgsConstructor
public class PaimentController {

    private final IPaimentService paimentService;

    @PostMapping("/ajouterPaiment")
    public Paiment addPaiment(@RequestBody Paiment paiment) {
        return paimentService.addPaiment(paiment);
    }

    @GetMapping("/allPaiments")
    public List<Paiment> getAllPaiments() {
        return paimentService.getAllPaiments();
    }

    @PutMapping("/modifierPaiment")
    public Paiment updatePaiment(@RequestBody Paiment paiment) {
        return paimentService.updatePaiment(paiment);
    }

    @DeleteMapping("/supprimerPaiment/{id}")
    public void deletePaiment(@PathVariable Long id) {
        paimentService.deletePaiment(id);
    }
}
