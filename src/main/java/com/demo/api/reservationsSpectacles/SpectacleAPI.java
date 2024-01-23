package com.demo.api.reservationsSpectacles;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/spectacles")
public class SpectacleAPI {
    private SpectacleManager spectacleManager = SpectacleManager.getSpectacleManager();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(Spectacle spectacle) {
        // BAD REQUEST
        Response errorResponse = getErrorResponse(spectacle);
        if(errorResponse != null) {
            return errorResponse;
        }

        // OK
        spectacleManager.add(spectacle);
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Spectacle> getAll(){
        return spectacleManager.getAll();
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getById(@PathParam("id") Integer id){
        // 404
        Spectacle spectacle = spectacleManager.getById(id);
        if(spectacle == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Spectacle Not Found !")
                    .build();
        }
        // OK
        return Response.ok(spectacle).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Integer id) {
        // 404
        Spectacle spectacle = spectacleManager.getById(id);
        if(spectacle == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Spectacle Not Found !")
                    .build();
        }
        // OK
        spectacleManager.delete(id);
        return Response.ok().build();
    }

    @PUT
    @Path("/{id}")
    public Response update(Spectacle spectacle, @PathParam("id") Integer id) {
        // BAD REQUEST
        if(!id.equals(spectacle.getId())){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Id differénts !")
                    .build();
        }
        else { // NOT FOUND
            Spectacle s = spectacleManager.getById(id);
            if(s == null){
                return Response.status(404)
                        .entity("Spectacle avec cet id introuvable !")
                        .build();
            }
        }
        // OK
        spectacleManager.update(id, spectacle);
        return Response.ok().build();
    }

    @PATCH
    @Path("/{id}")
    public Response patch(Spectacle spectacle, @PathParam("id") Integer id) {
        // BAD REQUEST
//        Response errorResponse = getErrorResponse(spectacle);
//        if(errorResponse != null) {
//            return errorResponse;
//        }
        // OK
        spectacleManager.patch(id, spectacle);
        return Response.status(Response.Status.ACCEPTED).build();
    }

    private Response getErrorResponse(Spectacle spectacle) {
        if(spectacle.getTitre().isBlank()){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Le Titre ne peut pas être vide !")
                    .build();
        }
        if(spectacle.getLieu().isBlank()){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Le Lieu ne peut pas être vide !")
                    .build();
        }
        if(spectacle.getDate().isBlank()){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("La Date ne peut pas être vide !")
                    .build();
        }
        if(spectacle.getNbPlacesDisponibles() == null){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Le Nombre de places disponibles ne peut pas être vide !")
                    .build();
        }
        return null;
    }
}
