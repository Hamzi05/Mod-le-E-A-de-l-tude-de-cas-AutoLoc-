package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation addReservation(Reservation reservation);

    List<Reservation> getAllReservations();

    Reservation updateReservation(Reservation reservation);

    void deleteReservation(Long idReservation);
}