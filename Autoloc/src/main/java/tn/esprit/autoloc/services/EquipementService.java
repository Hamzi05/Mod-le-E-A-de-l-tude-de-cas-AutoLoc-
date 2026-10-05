package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.repositories.EquipementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService {

    private EquipementRepository equipementRepository;


    public Equipement addEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }


    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }


    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }


    public void deleteEquipement(Long idEquipement) {
        equipementRepository.deleteById(idEquipement);
    }
}