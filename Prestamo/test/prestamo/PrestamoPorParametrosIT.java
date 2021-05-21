/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author maksy
 */

@RunWith(Parameterized.class)
public class PrestamoPorParametrosIT {
   
    Prestamo instance;
    private int res;
    private String esp;

    public PrestamoPorParametrosIT(int res, String esp) {
        this.res = res;
        this.esp = esp;
    }    
    

    @BeforeClass
    public static void setUpClass() {
        System.out.println("\nPrueba por parametros\n");
    }

    @Before
    public void setUp() {
        instance = new Prestamo();
    }
    
    @Parameters
    public static Iterable<Object> getData() {
        ArrayList<Object> obj = new ArrayList<>();
        
        obj.add(new Object[] {1000,"Felicidades, préstamo concedido"});
        obj.add(new Object[] {10,"Préstamo no concedido carece de interes"});
        
        return obj;
    }
   
    @Test
    public void testEstudioCaso1_1() {
        System.out.println("Prueba");
        int cantidad = this.res;
        String expResult = this.esp;
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }
    
}
