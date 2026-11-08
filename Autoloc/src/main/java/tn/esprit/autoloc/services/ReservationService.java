package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.repositories.ReservationRepository;
import tn.esprit.autoloc.repositories.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Long idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    @Override
    @Transactional
    public void affecterClientAReservation(Long idClient, Long idReservation) {
        Reservation reservation = reservationRepository.findById(idReservation)
                .orElseThrow(() -> new RuntimeException("Réservation introuvable avec l'id : " + idReservation));

        Client client = clientRepository.findById(idClient)
                .orElseThrow(() -> new RuntimeException("Client introuvable avec l'id : " + idClient));

        // Affectation du client à la réservation
        reservation.setClient(client);

        reservationRepository.save(reservation);
    }
}