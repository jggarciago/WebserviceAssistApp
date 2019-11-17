/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccionModelo;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Cliente de la aplicacion central
 * @author Jose Gustavo García
 * @author Juan Pablo Sánchez
 */
public class AgendarCitaModelo {
    
    /**TODO
     * 
     * @return 
     */
    public JsonObject consultarEnfermeros(){
        return Json.createObjectBuilder().add("idEnfermero", "123456789").build();
    }
}
