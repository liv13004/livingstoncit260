/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andrew
 */
public class GetInput extends View {
    public static String selectionOut = "Enter your selection below...";

    public GetInput() {
        super(" ");
    }
    
    //Scanner keyboard = new Scanner(System.in); //keyboard input stream

    

    @Override
    public char getChar() {
        String selection = null;

        while (true) {//while a valid name has not been retrieved
            //prompt for the player's name
            this.console.print(selectionOut);
            try {
                //get the name from the keyboard and trim off the blanks
                //selection = scanner.nextLine();
                selection = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(GetInput.class.getName()).log(Level.SEVERE, null, ex);
            }

            //if the name is invalid (less than two character in length)
            if (selection.length() != 1) {
                System.out.println("selection must be 1 character long...");
                ErrorView.display(this.getClass().getName(), "selection must be 1 character long...");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition

        }
        return selection.charAt(0); //return the char
    }

    @Override
    public String getString() {
        String selection = null;
        while (true) {
            this.console.print(selectionOut);
            try {
                selection = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(GetInput.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (selection.isEmpty()) {
                System.out.println("you must enter a valid string...");
                 ErrorView.display(this.getClass().getName(), "you must enter a valid string...");
                continue;
            }
            break;
        }
        return (selection);
    }

    
    @Override
    public String getNumber() {
        String selection = null;
        while (true) {
            this.console.println(selectionOut);

            try {
                selection = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(GetInput.class.getName()).log(Level.SEVERE, null, ex);
            }
           // double number = Double.parseDouble(selection);
           // Double.toString(number);
            break;

        }
        return (selection);
    }

//    @Override
//    public void doAction(Object obj) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private static class scanner {
//
//        public scanner() {
//        }
//    }

    @Override
    public void doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
