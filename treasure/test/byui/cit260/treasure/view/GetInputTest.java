/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

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
public class GetInputTest {

    public GetInputTest() {
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
     * Test of getChar method, of class GetInput.
     */
    @Test
    public void testGetChar() {
        System.out.println("getChar");
        GetInput instance = new GetInput();
        char expResult = 'd';
        char result = instance.getChar();
        assertEquals(expResult, result);

    }

    /**
     * Test of getString method, of class GetInput.
     */
    @Test
    public void testGetString() {
        System.out.println("getString");
        GetInput instance = new GetInput();
        String expResult = "test";
        String result = instance.getString();
        assertEquals(expResult, result);

    }

}
