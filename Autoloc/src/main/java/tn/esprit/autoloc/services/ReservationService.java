package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

    private ReservationRepository reservationRepository;


    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }


    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }


    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }


    public void deleteReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);
    }
}