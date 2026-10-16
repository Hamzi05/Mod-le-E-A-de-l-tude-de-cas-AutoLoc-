
package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.services.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservations")
@AllArgsConstructor
public class ReservationController {

    private final IReservationService reservationService;

    @PostMapping("/ajouterReservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @GetMapping("/allReservations")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PutMapping("/modifierReservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }

    @DeleteMapping("/supprimerReservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }
}
