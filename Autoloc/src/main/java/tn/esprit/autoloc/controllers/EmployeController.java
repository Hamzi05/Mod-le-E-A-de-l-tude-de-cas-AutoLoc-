
package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.services.IEmployeService;

import java.util.List;

@RestController
@RequestMapping("/employes")
@AllArgsConstructor
public class EmployeController {

    private final IEmployeService employeService;

    @PostMapping("/ajouterEmploye")
    public Employe addEmploye(@RequestBody Employe employe) {
        return employeService.addEmploye(employe);
    }

    @GetMapping("/allEmployes")
    public List<Employe> getAllEmployes() {
        return employeService.getAllEmployes();
    }

    @PutMapping("/modifierEmploye")
    public Employe updateEmploye(@RequestBody Employe employe) {
        return employeService.updateEmploye(employe);
    }

    @DeleteMapping("/supprimerEmploye/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteEmploye(id);
    }
}
