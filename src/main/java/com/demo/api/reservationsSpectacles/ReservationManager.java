package com.demo.api.reservationsSpectacles;

import java.util.HashMap;
import java.util.List;

public class ReservationManager {
    private HashMap<Integer, Reservation> reservations = new HashMap<>();
    private Integer idCount = 0;
    private static ReservationManager reservationManager;
    public static ReservationManager getReservationManager() {
        if(reservationManager == null) {
            reservationManager = new ReservationManager();
        }
        return reservationManager;
    }

    private ReservationManager(){}

    public void add(Reservation reservation) {
        idCount++;
        reservation.setId(idCount);
        reservations.put(idCount,reservation);
    }

    public List<Reservation> getAll() {
        return reservations.values().stream().toList();
    }
}
