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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author maksy
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({prestamo.PrestamoPruebaDeValoresBordeIT.class})
public class prestamoSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("\nSuite de prueba de valores borde\n");
    }
    
}
