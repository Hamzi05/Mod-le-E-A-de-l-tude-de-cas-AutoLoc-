package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Maintenance;
import tn.esprit.autoloc.repositories.MaintenanceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService {

    private MaintenanceRepository maintenanceRepository;


    public Maintenance addMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }


    public List<Maintenance> getAllMaintenances() {
        return maintenanceRepository.findAll();
    }


    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }


    public void deleteMaintenance(Long idMaintenance) {
        maintenanceRepository.deleteById(idMaintenance);
    }
}