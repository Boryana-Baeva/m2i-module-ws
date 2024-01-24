package com.demo.api.reservationsSpectacles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Spectacle {
    private Integer id;
    private String titre;
    private String lieu;
    private String date;
    private Integer nbPlacesDisponibles;

    public Spectacle() {
    }

    public Spectacle(String titre, String lieu, String date,Integer nbPlacesDisponibles) {
        this.titre = titre;
        this.lieu = lieu;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
                ", nbPlacesDisponibles=" + nbPlacesDisponibles +
                '}';
    }

    public void setNotNull(Spectacle spectacle) {
        if(spectacle.getTitre() != null)
            setTitre(spectacle.getTitre());

        if(spectacle.getLieu() != null)
            setLieu(spectacle.getLieu());

        if(spectacle.getDate() != null)
            setDate(spectacle.getDate());

        if(spectacle.getNbPlacesDisponibles() != null)
            setNbPlacesDisponibles(spectacle.getNbPlacesDisponibles());
    }

    public LocalDate getLocalDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(date, formatter);
    }
}
