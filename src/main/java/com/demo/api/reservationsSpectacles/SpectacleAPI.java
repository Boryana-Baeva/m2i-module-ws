package com.demo.api.reservationsSpectacles;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/spectacles")
public class SpectacleAPI {
    private SpectacleManager spectacleManager = SpectacleManager.getSpectacleManager();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void add(Spectacle spectacle) {
        spectacleManager.add(spectacle);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Spectacle getById(Integer id){
        return spectacleManager.getById(id);
    }
}
