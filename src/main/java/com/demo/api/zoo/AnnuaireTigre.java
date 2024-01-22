package com.demo.api.zoo;

import java.util.HashMap;
import java.util.List;

public class AnnuaireTigre {
    private Integer id = 0;
    private HashMap<Integer, Tigre> tigres = new HashMap<>();

    public List<Tigre> getAll(){
        return tigres.values().stream().toList();
    }

    public void add(Tigre tigre) {
        id++;
        tigre.setId(id);
        tigres.put(id,tigre);
    }

    public Tigre getById(Integer id) {
        return tigres.get(id);
    }

    public void delete(Integer id){
        tigres.remove(id);
    }

    public void update(Integer id, Tigre tigre) {
        tigres.replace(id, tigre);
    }

    public void patch(Integer id, Tigre tigre) {
        Tigre tigreExisting = tigres.get(id);

        if(tigre.getNom() != null)
            tigreExisting.setNom(tigre.getNom());

        if(tigre.getCouleur() != null)
            tigreExisting.setCouleur(tigre.getCouleur());

        if(tigre.getAge() != 0)
            tigreExisting.setAge(tigre.getAge());

        tigres.replace(id, tigreExisting);
    }

}
