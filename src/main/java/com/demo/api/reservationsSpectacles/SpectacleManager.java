package com.demo.api.reservationsSpectacles;


import java.util.HashMap;

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

    public void add(Spectacle spectacle) {
        idCount++;
        spectacle.setId(idCount);
        spectacles.put(idCount,spectacle);
    }


    public Spectacle getById(Integer id){
        return spectacles.get(id);
    }
}
