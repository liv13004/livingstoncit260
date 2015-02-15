/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrew
 */
public class MathcontrolTest {

    public MathcontrolTest() {
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
        Mathcontrol instance = new Mathcontrol();
        boolean expResult = false;
        boolean result = instance.math();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turtle method, of class Mathcontrol.
     */
    @Test
    public void testTurtle() {
        System.out.println("turtle");
        double turtle = 0.0;
        int counter = 0;
        Mathcontrol instance = new Mathcontrol();
        boolean expResult = false;
        boolean result = instance.turtle(turtle, counter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
