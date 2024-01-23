package com.demo.api.reservationsSpectacles;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Spectacle {
    private Integer id;
    private String titre;
    private String lieu;
    private LocalDate date;
    private LocalTime time;
    private Integer nbPlacesDisponibles;

    public Spectacle() {
    }

    public Spectacle(String titre, String lieu, LocalDate date, LocalTime time, Integer nbPlacesDisponibles) {
        this.titre = titre;
        this.lieu = lieu;
        this.date = date;
        this.time = time;
        this.nbPlacesDisponibles = nbPlacesDisponibles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Integer getNbPlacesDisponibles() {
        return nbPlacesDisponibles;
    }

    public void setNbPlacesDisponibles(Integer nbPlacesDisponibles) {
        this.nbPlacesDisponibles = nbPlacesDisponibles;
    }

    public boolean isComplet() {
        return nbPlacesDisponibles <= 0;
    }

    @Override
    public String toString() {
        return "Spectacle{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", lieu='" + lieu + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", nbPlacesDisponibles=" + nbPlacesDisponibles +
                '}';
    }
}
