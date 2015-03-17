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
public class GameMenuViewTest {

    public GameMenuViewTest() {
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
     * Test of doAction method, of class GameMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        Object obj = (Object) "m";
        GameMenuView instance = new GameMenuView();
        boolean expResult = false;
        boolean result = instance.doAction(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

}
