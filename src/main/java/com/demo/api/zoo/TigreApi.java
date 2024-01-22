package com.demo.api.zoo;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/tigres")
public class TigreApi {
    private static AnnuaireTigre annuaireTigre = new AnnuaireTigre();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tigre> getAll(){
        return annuaireTigre.getAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void add(Tigre tigre) {
        annuaireTigre.add(tigre);
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Tigre getById(@PathParam("id") Integer id) {
        return annuaireTigre.getById(id);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Integer id) {
        annuaireTigre.delete(id);
    }

    @PUT
    @Path("/{id}")
    public void update(@PathParam("id") Integer id, Tigre tigre) {
        annuaireTigre.update(id, tigre);
    }

    @PATCH
    @Path("/{id}")
    public void patch(@PathParam("id") Integer id, Tigre tigre) {
        annuaireTigre.patch(id, tigre);
    }
}
