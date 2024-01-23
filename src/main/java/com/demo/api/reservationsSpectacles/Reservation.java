package com.demo.api.reservationsSpectacles;

public class Reservation {
    private Integer id;
    private Integer spectacleId;
    private String client;

    public Reservation() {
    }

    public Reservation(Integer spectacleId, String client) {
        this.spectacleId = spectacleId;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpectacleId() {
        return spectacleId;
    }

    public void setSpectacleId(Integer spectacleId) {
        this.spectacleId = spectacleId;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", spectacleId=" + spectacleId +
                ", client='" + client + '\'' +
                '}';
    }
}
