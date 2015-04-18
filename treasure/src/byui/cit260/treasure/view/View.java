/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import treasure.Treasure;

/**
 *
 * @author Braden
 */
public abstract class View implements ViewInterface {
    
    //Scanner scanner = new Scanner(System.in); //keyboard input stream
    String promptMessage;
    
    protected final BufferedReader keyboard = Treasure.getInFile();
    protected final BufferedReader keyboardInt = Treasure.getInFile();
    protected final PrintWriter console = Treasure.getOutFile();

    //private Object objString;
    public View(String promptMessage) {
        //if (promptMessage.contentEquals(""))
        //this.objString = objString; 
        //else 
        //this.promptMessage = promptMessage;
        //this.objString = objString;

        //if System.out.print(MainMenuView.mainMenu);
        this.promptMessage = promptMessage;
    }

    @Override
    public void display() {
        int displayPromptMessage = 0;
        String value = "";
        //if (promptMessage.contentEquals(""))
        //System.out.print(this.objString);
        // else 
        //System.out.println(this.promptMessage);
        do {
            if (displayPromptMessage == 0) {



      this.console.println(promptMessage);
                displayPromptMessage++;

            } else {

                value = getInput();
                this.doAction(value);
                displayPromptMessage = 0;
            }

        } while (!value.equals("b"));
        // while(!value.equals("b"));
    }

    @Override
    public String getInput() {
        
        boolean valid = false; //indicates if the name has been retrieved
        String selection = null;
        try{
        while (!valid) {//while a valid name has not been retrieved
            //prompt for the player's name
             this.console.println(" \n \n Enter your selection below;");
            //get the name from the keyboard and trim off the blanks

            selection = this.keyboard.readLine();
            selection = selection.trim();

            //if the name is invalid (less than two character in length)
            if (selection.length() < 1) {
                 this.console.println(selection);
                System.out.println("\n*** Invalid selection *** Try again");
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
                continue; // and repeat again
                // System.out.print(this.promptMessage);
            }
            break; // out of the (exit) the repetition

        }
        }catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
             ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            
        
    }
       return selection; //return the name
    }
    @Override
    public char getChar() {
        String selection = null;

        while (true) {//while a valid name has not been retrieved
            //prompt for the player's name
             this.console.println("Enter your selection below...");
            try {
                //get the name from the keyboard and trim off the blanks
                selection = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }

           // selection = scanner.next();

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
             this.console.println("Enter your selection Below...");
            try {
                selection = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            //scanner.next();
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
             this.console.println("Enter your selection Below...");
            try{
                selection = this.keyboardInt.readLine();
            }catch(NumberFormatException nf){
                System.out.println("\nYou need to enter a valid number");
                 ErrorView.display(this.getClass().getName(), "\nYou need to enter a valid number");
                nf.printStackTrace(System.out);
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            break;

        }
        return (selection);
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

}
