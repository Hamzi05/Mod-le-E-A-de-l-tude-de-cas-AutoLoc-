package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.repositories.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {

    private ClientRepository clientRepository;


    public Client addClient(Client client) {
        return clientRepository.save(client);
    }


    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }


    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }


    public void deleteClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }
}