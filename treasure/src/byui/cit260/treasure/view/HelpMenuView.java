/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import byui.cit260.treasure.control.GameControl;
import java.util.Scanner;
import treasure.Treasure;

/**
 *
 * @author Braden
 */
public class HelpMenuView {
    
    void displayHelpMenu() {
        char selection;
        do {
            System.out.println(
                    "\nn = Need some Help?"
                    + "\nG = What is the goal of the game?"
                    + "\nM = How to Move"
                    + "\nL = Estimating the amount of lumber"
                    + "\nC = Convert from Metric to Standard"
                    + "\nQ = Quit");
            String input = this.getInput(); //get the user's selection
            selection = input.charAt(0); //get first character of string
            this.doAction(selection); //do action based on selection
        } while (selection != 'q');
    }


    
}