package com.demo.api.reservationsSpectacles;

import java.util.HashMap;
import java.util.List;

public class SpectacleManager {
    private HashMap<Integer, Spectacle> spectacles = new HashMap<>();
    private Integer idCount = 0;
    private static SpectacleManager spectacleManager;
    public static SpectacleManager getSpectacleManager() {
        if(spectacleManager == null) {
            spectacleManager = new SpectacleManager();
        }
        return spectacleManager;
    }

    private SpectacleManager(){}

    public void add(Spectacle spectacle) {
        idCount++;
        spectacle.setId(idCount);
        spectacles.put(idCount,spectacle);
    }


    public Spectacle getById(Integer id){
        return spectacles.get(id);
    }

    public List<Spectacle> getAll() {
        return spectacles.values().stream().toList();
    }

    public void delete(Integer id){
        spectacles.remove(id);
    }

    public void update(Integer id, Spectacle spectacle) {
        spectacles.replace(id, spectacle);
    }

    public void patch(Integer id, Spectacle spectacle) {
        Spectacle spectacleExisting = spectacles.get(id);

        spectacleExisting.setNotNull(spectacle);

        spectacles.replace(id, spectacleExisting);
    }
}
