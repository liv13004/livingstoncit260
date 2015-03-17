/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.model.Player;
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
public class PlayerControlTest {

    public PlayerControlTest() {
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
     * Test of createPlayer method, of class PlayerControl.
     */
    @Test
    public void testCreatePlayer() {
        for (long i = 0; i > 10; i++) {
            System.out.println("createPlayer");
            String playerName = "fred" + i;
            Player player = new Player();
            player.setName(playerName);
            Player expResult = player;
            Player result = PlayerControl.createPlayer(playerName);
            assertEquals(expResult, result);
        }

    }

}
