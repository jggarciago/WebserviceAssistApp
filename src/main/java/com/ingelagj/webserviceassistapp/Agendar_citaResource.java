/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ingelagj.webserviceassistapp;

import coneccionModelo.AgendarCitaModelo;
import javax.json.JsonObject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Servicio REST para Android de Agendar Cita
 *
 * @author Jose Gustavo García
 * @author Juan Pablo Sánchez
 */
@Path("agendar")
public class Agendar_citaResource {

    @Context
    private UriInfo context;
    
    private AgendarCitaModelo modelo;
    
    public Agendar_citaResource(){
        modelo = new AgendarCitaModelo();
    }
    public Agendar_citaResource(AgendarCitaModelo modelo){
        this.modelo = modelo;
    }

    /** TODO
     * Retorna los enfermeros
     * @return 
     */
    @GET
    @Path("consultarEnfermeros")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject consultarEnfermeros() {
        return modelo.consultarEnfermeros();
    }

    /** TODO
     * Agenda la cita
     * @param content representation for the resource
     * @return 
     */
    @POST
    @Path("agendarCita")
    @Consumes(MediaType.APPLICATION_JSON)
    public void agendarCita(JsonObject content) {
    }  
    
}
