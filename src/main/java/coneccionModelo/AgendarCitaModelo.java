/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccionModelo;

import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonObject;

/**
 * Cliente de la aplicacion central
 * @author Jose Gustavo García
 * @author Juan Pablo Sánchez
 */
public class AgendarCitaModelo {
    
    /**
     * 
     * 
     * @return 
     */
    public JsonObject consultarEnfermeros(){
        return Json.createObjectBuilder().add("enfermeros",Json.createArrayBuilder()
                .add(Json.createObjectBuilder().add("idEnfermero", "123456789").add("nombreEnfermero", "Javier Hernandez"))
                .add(Json.createObjectBuilder().add("idEnfermero", "987654321").add("nombreEnfermero", "Carlos Fuentes"))
        ).build();
    }
    
    
}
