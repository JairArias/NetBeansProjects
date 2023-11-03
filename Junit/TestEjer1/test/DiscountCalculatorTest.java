/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidades.DiscountCalculator;
import Servicios.DiscountCalculatorServicios;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ryzen
 */
public class DiscountCalculatorTest {

    public DiscountCalculatorTest() {
    }

    DiscountCalculatorServicios dcs;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        dcs = new DiscountCalculatorServicios();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void descuento10() {
        assertEquals(100, dcs.desc10(new DiscountCalculator(1000.0, 0.10)), 0);
        assertEquals(200, dcs.desc10(new DiscountCalculator(1000.0, 0.20)), 0);
    }

    public void descuento25() {
        assertEquals(100, dcs.desc25(new DiscountCalculator(1000.0, 0.10)), 0);
        assertEquals(200, dcs.desc25(new DiscountCalculator(1000.0, 0.20)), 0);
    }

    public void descuento50() {
        assertEquals(250, dcs.desc50(new DiscountCalculator(1000.0, 0.25)), 0);
        assertEquals(3750, dcs.desc50(new DiscountCalculator(15000.0, 0.25)), 0);
    }

    public void descuento75() {
        assertEquals(750, dcs.desc75(new DiscountCalculator(1000.0, 0.75)), 0);
        assertEquals(15750, dcs.desc75(new DiscountCalculator(21000.0, 0.75)), 0);
    }
    public void sinDescuento(){
        assertEquals(155000, dcs.sinDesc(new DiscountCalculator(155000.0,1.0)),0);
        assertEquals(200000, dcs.sinDesc(new DiscountCalculator(200000.0,0.1)),0);
    }
}
