/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.model.Player;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import treasure.Treasure;

/**
 *
 * @author Braden
 */
public class GameControlTest {

    public GameControlTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of createNewGame method, of class GameControl.
     */
//    @Test
//    public void testCreateNewGame() {
//        System.out.println("createNewGame");
//        Player player = null;
//        GameControl.createNewGame(player);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of createPlayer method, of class GameControl.
     */
    @Test
    public void testCreatePlayer() {
        System.out.println("createPlayer");
        String name = "john";
        Player player = new Player();
        player.setName("john");
        Treasure.setPlayer(player);
        Player expResult = player;
        Player result = GameControl.createPlayer(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of createHelpMenu method, of class GameControl.
     */
    @Test
    public void testCreateHelpMenu() {
        System.out.println("createHelpMenu");
        Player player = null;
        GameControl.createHelpMenu(player);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of createBoatMenu method, of class GameControl.
     */
    @Test
    public void testCreateBoatMenu() {
        System.out.println("createBoatMenu");
        Player player = null;
        GameControl.createBoatMenu(player);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of createMapView method, of class GameControl.
     */
    @Test
    public void testCreateMapView() {
        System.out.println("createMapView");
        Player player = null;
        GameControl.createMapView(player);
        // TODO review the generated test code and remove the default call to fail.

    }

}
