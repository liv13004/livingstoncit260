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
public abstract class View implements ViewInterface {

    Scanner scanner = new Scanner(System.in); //keyboard input stream
    private String promptMessage;

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

                System.out.print(promptMessage);
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

        while (!valid) {//while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println(" \n \n Enter your selection below;");
            //get the name from the keyboard and trim off the blanks

            selection = scanner.nextLine();
            selection = selection.trim();

            //if the name is invalid (less than two character in length)
            if (selection.length() < 1) {
                System.out.println(selection);
                System.out.println("\n*** Invalid selection *** Try again");
                continue; // and repeat again
                // System.out.print(this.promptMessage);
            }
            break; // out of the (exit) the repetition

        }

        return selection; //return the name
    }

    @Override
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

    @Override
    public String getString() {
        String selection = null;
        while (true) {
            System.out.println("Enter your selection Below...");
            selection = scanner.next();
            if (selection.isEmpty()) {
                System.out.println("you must enter a valid string...");
                continue;
            }
            break;
        }
        return (selection);
    }

    @Override
    public double getNumber() {
        double selection = 0;
        while (true) {
            System.out.println("Enter your selection Below...");
            try{
                selection = scanner.nextDouble();
            }catch(NumberFormatException nf){
                System.out.println("\nYou need to enter a valid number");
                nf.printStackTrace(System.out);
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
