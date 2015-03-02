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
public class GetInput {
    Scanner scanner = new Scanner(System.in); //keyboard input stream
    public char getChar() {
        String selection = null;
        

        while (true) {//while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println("Enter your selection below...");
            //get the name from the keyboard and trim off the blanks
            selection = scanner.next();
            
            //if the name is invalid (less than two character in length)
            if (selection.length() != 1) {
                System.out.println("selection must be 1 character long...");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition

        }
        return selection.charAt(0); //return the char
    }
    
    public String getString(){
        String selection = null;
        while(true){
            System.out.println("Enter your selection Below...");
            selection = scanner.next();
            if (selection.isEmpty()){
                System.out.println("you must enter a valid string...");
                continue;
            }
            break;
        }
        return(selection);
    }

    public double getNumber() {
double selection;
        while(true){
            System.out.println("Enter your selection Below...");
            
            if (scanner.hasNextDouble()){
                System.out.println("you must enter a valid string...");
                continue;
            }
            selection = scanner.nextDouble();
            
            break;
            
        }
        return(selection);    }
}