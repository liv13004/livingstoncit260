/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrew
 */
public class GoldTest {

    public GoldTest() {
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
     * Test of getGold method, of class Gold.
     */
    @Test
    public void testGetGold() {
        System.out.println("getGold");
        Gold instance = new Gold();
        int expResult = 5;
        int result = instance.getGold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setGold method, of class Gold.
     */
    @Test
    public void testSetGold() {
        System.out.println("setGold");
        int gold = 0;
        Gold instance = new Gold();
        instance.setGold(gold);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Gold.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Gold instance = new Gold();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Gold.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Gold instance = new Gold();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Gold.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Gold instance = new Gold();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
