/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author andrew
 */
public class MathControlTest {

    public MathControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of math method, of class Mathcontrol.
     */
    @Test
    public void testMath() {
        System.out.println("math");
        MathControl instance = new MathControl();
        boolean expResult = false;
        boolean result = instance.math();
        assertEquals(expResult, result);

    }

    /**
     * Test of turtle method, of class Mathcontrol.
     */
    @Test
    public void testTurtle() {
        System.out.println("turtle");
        double turtle = 50;
        int counter = 40;
        MathControl instance = new MathControl();
        boolean expResult = true;
        boolean result = instance.turtle(turtle, counter);
        assertEquals(expResult, result);

    }

}
