/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maksy
 */
public class PrestamoPruebaDeValoresBordeIT {

    Prestamo instance;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("\nPrueba de Valores Borde\n");
    }

    @Before
    public void setUp() {
        instance = new Prestamo();
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void testEstudioCaso1_1() {
        System.out.println("Caso 1.4:\n"
                + "Datos de entrada: valor igual a 1000.\n"
                + "Datos de salida esperados: Felicidades, préstamo concedido.");
        int cantidad = 1000;
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

    @Test
    public void testEstudioCaso1_2() {
        System.out.println("Caso 1.5:\n"
                + "Datos de entrada: valor igual a 15000.\n"
                + "Datos de salida esperados: Felicidades, préstamo concedido.");
        int cantidad = 15000;
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

}
