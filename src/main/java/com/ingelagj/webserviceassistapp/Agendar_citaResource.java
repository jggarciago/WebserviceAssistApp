/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingelagj.webserviceassistapp;

import java.math.BigDecimal;
import javax.json.Json;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Admin
 */
@Path("agendar_cita")
public class Agendar_citaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Agendar_citaResource
     */
    public Agendar_citaResource() {
    }

    /** TODO
     * Retorna los enfermeros
     * Retrieves representation of an instance of com.ingelagj.webserviceassistapp.Agendar_citaResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("consultarEnfermeros")
    @Produces(MediaType.APPLICATION_JSON)
    public Response consultarEnfermeros() {
        return Response.ok().entity(Json.createObjectBuilder().add("idEnfermero", "123456789")).build();
    }

    /** TODO
     * Agenda la cita
     * POST method for updating or creating an instance of Agendar_citaResource
     * @param content representation for the resource
     */
    @POST
    @Path("agendarCita")
    @Consumes(MediaType.APPLICATION_JSON)
    public void agendarCita(String content) {
    }  
    
}
