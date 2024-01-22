package com.demo.api.zoo;

public class Tigre {
    private Integer id;
    private String nom;
    private String couleur;
    private Integer age;

    public Tigre() {
    }

    public Tigre(String nom, String couleur, Integer age) {
        this.nom = nom;
        this.couleur = couleur;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", couleur='" + couleur + '\'' +
                ", age=" + age +
                '}';
    }
}
