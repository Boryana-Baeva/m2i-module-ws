package com.demo.api.personnes;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("/personnes")
public class PersonneApi {
    private static AnnuairePersonne annuaire = new AnnuairePersonne();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Personne> getPersonnes(){
//        ArrayList<Personne> resultat = new ArrayList<>();
//        resultat.add(new Personne("JC", "Dominguez"));
//        resultat.add(new Personne("Alain", "Dupont"));
//        return resultat;
        return annuaire.getList();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addPersonne(Personne newPersonne){
        System.out.println(newPersonne);

        if(newPersonne.getNom().isBlank()) {
            // BAD REQUEST
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Le nom ne peut pas être vide !")
                    .build();
        }

        // OK
        annuaire.addPersonne(newPersonne);
        //return Response.ok(newPersonne).build();
        return Response.status(Response.Status.CREATED).entity(newPersonne).build();
    }

    @GET()
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersonne(@PathParam("id") Integer id){
        Personne personne = annuaire.getPersonne(id);
        if(personne == null){
            // 404
            return Response.status(404).entity("Person Not Found !").build();
        }
        return Response.ok(personne).build();
    }

    @DELETE
    @Path("/{id}")
    public void deletePersonne(@PathParam("id") Integer id) {
        annuaire.deletePersonne(id);
    }

    @PUT
    @Path("/{id}")
    public void updatePersonne(Personne personne, @PathParam("id") Integer id) {
        annuaire.updatePersonne(id, personne);
    }

    @PATCH
    @Path("/{id}")
    public void patchPersonne(Personne personne, @PathParam("id") Integer id) {
        annuaire.patchPersonne(id, personne);
    }
}
