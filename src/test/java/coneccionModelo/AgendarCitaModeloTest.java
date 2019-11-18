/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccionModelo;


import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class AgendarCitaModeloTest {
    
    public AgendarCitaModeloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of consultarEnfermeros method, of class AgendarCitaModelo.
     */
    @Test
    public void testConsultarEnfermeros() {
        System.out.println("consultarEnfermeros");
        AgendarCitaModelo instance = new AgendarCitaModelo();
        JsonObject expResult = jsonEsperadoEnfermero();
        JsonObject result = instance.consultarEnfermeros();
        assertEquals(expResult, result);
    }
    
    private JsonObject jsonEsperadoEnfermero(){
        JsonObject enfermero1 = Json.createObjectBuilder().add("idEnfermero", "123456789")
                .add("nombreEnfermero", "Javier Hernandez").build();
        JsonObject enfermero2 = Json.createObjectBuilder().add("idEnfermero", "987654321")
                .add("nombreEnfermero", "Carlos Fuentes").build();
        JsonArray array = Json.createArrayBuilder().add(enfermero1).add(enfermero2).build();
        return Json.createObjectBuilder().add("enfermeros",array).build();
    }
    
}
