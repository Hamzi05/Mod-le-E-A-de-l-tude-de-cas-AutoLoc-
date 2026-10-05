package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Employe;

import java.util.List;

public interface IEmployeService {

    Employe addEmploye(Employe employe);

    List<Employe> getAllEmployes();

    Employe updateEmploye(Employe employe);

    void deleteEmploye(Long idEmploye);
}