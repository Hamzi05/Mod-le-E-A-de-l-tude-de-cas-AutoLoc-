package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.repositories.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService {

    private EmployeRepository employeRepository;


    public Employe addEmploye(Employe employe) {
        return employeRepository.save(employe);
    }


    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }


    public Employe updateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }


    public void deleteEmploye(Long idEmploye) {
        employeRepository.deleteById(idEmploye);
    }
}