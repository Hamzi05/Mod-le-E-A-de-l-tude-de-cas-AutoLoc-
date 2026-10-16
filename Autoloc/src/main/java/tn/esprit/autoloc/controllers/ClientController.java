
package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.services.IClientService;

import java.util.List;

@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {

    private final IClientService clientService;

    @PostMapping("/ajouterClient")
    public Client addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }

    @GetMapping("/allClients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @PutMapping("/modifierClient")
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }

    @DeleteMapping("/supprimerClient/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}
