/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.model.Player;
import treasure.Treasure;

/**
 *
 * @author andrew
 */
public class PlayerControl {

    public static Player createPlayer(String playerName) {
        if (playerName == null){
            return null;
        }
        System.out.println("creating player");
        Player player = new Player();
        player.setName(playerName);
        Treasure.setPlayer(player);
        return player;
    }
    
}
