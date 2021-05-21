/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maksy
 */
public class PrestamoPruebaDeEquivalenciaIT {

    Prestamo instance;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("\nPrueba de Equivalencia\n");
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
        System.out.println("Caso 1.1:\n"
                + "Datos de entrada: valor menor a 1000.\n"
                + "Datos de salida esperados: Préstamo no concedido carece de interes.");
        int cantidad = 988;
        String expResult = "Préstamo no concedido carece de interes";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

    @Test
    public void testEstudioCaso1_2() {
        System.out.println("Caso 1.2:\n"
                + "Datos de entrada: valor entre 1000 y 15000.\n"
                + "Datos de salida esperados: Felicidades, préstamo concedido.");
        int cantidad = 1001;
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

    @Test
    public void testEstudioCaso1_3() {
        System.out.println("Caso 1.3:\n"
                + "Datos de entrada: valor mayor a 15000\n"
                + "Datos de salida esperados: Préstamo no concedido es una operación con demasiado riesgo.");
        int cantidad = 15541;
        String expResult = "Préstamo no concedido es una operación con demasiado riesgo";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

}
