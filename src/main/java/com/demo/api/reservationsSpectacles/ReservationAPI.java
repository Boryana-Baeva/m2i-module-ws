package com.demo.api.reservationsSpectacles;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.stream.Collectors;

@Path("reservations")
public class ReservationAPI {
    private ReservationManager reservationManager = ReservationManager.getReservationManager();
    private SpectacleManager spectacleManager = SpectacleManager.getSpectacleManager();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response add(Reservation reservation) {
        // BAD REQUEST
        Response errorResponse = getErrorResponse(reservation);
        if(errorResponse != null) {
            return errorResponse;
        }

        // OK
        reservationManager.add(reservation);
        return Response.status(Response.Status.CREATED).build();
    }


    private Response getErrorResponse(Reservation reservation) {
        if(reservation.getSpectacleId() == null){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Le Spectacle Id ne peut pas être vide !")
                    .build();
        }
        if(reservation.getClient().isBlank()){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Le Pseudo Client ne peut pas être vide !")
                    .build();
        }

        List<Integer> existingSpectacleIds = spectacleManager.getAll()
                                                .stream()
                                                .map(s -> s.getId())
                                                .collect(Collectors.toList());
        boolean idExists = existingSpectacleIds
                            .stream()
                            .anyMatch(i -> i.equals(reservation.getSpectacleId()));

        if(!idExists){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Aucun spéctacle trouvé avec cet id !")
                    .build();
        }

        return null;
    }
}
