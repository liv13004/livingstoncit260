/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.model.Gold;

/**
 *
 * @author andrew
 */
public class GoldControl {

    Gold gold = new Gold();

    public void addGold(int payment) {
        gold.setGold(gold.getGold() + payment);
    }

    /**
     *
     * @param amount
     * @param character
     */
}
