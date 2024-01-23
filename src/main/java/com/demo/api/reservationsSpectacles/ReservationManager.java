package com.demo.api.reservationsSpectacles;

import java.util.HashMap;

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

    public void add(Reservation reservation) {
        idCount++;
        reservation.setId(idCount);
        reservations.put(idCount,reservation);
    }
}
