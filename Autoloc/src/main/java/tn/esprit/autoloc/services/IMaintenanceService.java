package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {

    Maintenance addMaintenance(Maintenance maintenance);

    List<Maintenance> getAllMaintenances();

    Maintenance updateMaintenance(Maintenance maintenance);

    void deleteMaintenance(Long idMaintenance);
}