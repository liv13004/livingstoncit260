/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import java.util.Scanner;

/**
 *
 * @author andrew
 */
public class GetInput extends View {

    //Scanner keyboard = new Scanner(System.in); //keyboard input stream

    public GetInput(String promptMessage) {
        super(promptMessage);
    }

    @Override
    public char getChar() {
        String selection = null;

        while (true) {//while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println("Enter your selection below...");
            //get the name from the keyboard and trim off the blanks
            //selection = scanner.nextLine();
             selection = keyboard.nextLine();

            //if the name is invalid (less than two character in length)
            if (selection.length() != 1) {
                System.out.println("selection must be 1 character long...");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition

        }
        return selection.charAt(0); //return the char
    }

    public String getString() {
        String selection = null;
        while (true) {
            System.out.println("Enter your selection Below...");
            selection = keyboard.nextLine();
            if (selection.isEmpty()) {
                System.out.println("you must enter a valid string...");
                continue;
            }
            break;
        }
        return (selection);
    }

    public double getNumber() {
        double selection;
        while (true) {
            System.out.println("Enter your selection Below...");

            selection = keyboard.nextDouble();
            
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
