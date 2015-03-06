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
    private String promptMessage;
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display(){
        String value;
        do{
            
            System.out.println(this.promptMessage);
            value = getInput();
            boolean doAction = this.doAction(value);
        }while(!value.equals("q"));
    }
    
    @Override
    public String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println("Enter your selection below;");
            //get the name from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            //if the name is invalid (less than two character in length)
            if (selection.length() < 1) {
                System.out.println("\n*** Invalid selection *** Try again");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition

        }
        return selection; //return the name
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    
    
}
