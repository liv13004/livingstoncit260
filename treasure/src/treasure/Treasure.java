/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treasure;

import byui.cit260.treasure.model.Player;

/**
 *
 * @author andrew
 */
public class Treasure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player player = new Player();
        player.setName("Fred Flinstone");
        player.setGender(true);
        
        String playerInfo=player.toString();
        System.out.println(playerInfo);
        
    }
    
}
