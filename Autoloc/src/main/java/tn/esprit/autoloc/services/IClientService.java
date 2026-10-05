package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Client;

import java.util.List;

public interface IClientService {

    Client addClient(Client client);

    List<Client> getAllClients();

    Client updateClient(Client client);

    void deleteClient(Long idClient);
}