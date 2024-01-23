package com.demo.api.reservationsSpectacles;

public class Reservation {
    private Integer id;
    private Spectacle spectacle;
    private String client;
    private ReservationStatus status = ReservationStatus.PENDING;

    public Reservation() {
    }

    public Reservation(Spectacle spectacle, String client, ReservationStatus status) {
        this.spectacle = spectacle;
        this.client = client;
        this.status = status;
    }

    public Reservation(Spectacle spectacle, String client) {
        this.spectacle = spectacle;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Spectacle getSpectacle() {
        return spectacle;
    }

    public void setSpectacle(Spectacle spectacle) {
        this.spectacle = spectacle;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", spectacle=" + spectacle +
                ", client='" + client + '\'' +
                ", status=" + status +
                '}';
    }
}
