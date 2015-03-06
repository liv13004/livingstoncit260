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
    
    public View(String promptMessage){
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display(){
        String value;
        do{
            
            System.out.println(this.promptMessage);
            value = getInput();
            this.doAction(value);
        }while(!value.equals("b"));
    }
    
    @Override
    public String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String selection = null;

        while (!valid) {//while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println("Enter your selection below;");
            //get the name from the keyboard and trim off the blanks
            selection = scanner.nextLine();
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
    @Override
    public double getNumber() {
double selection;
        while(true){
            System.out.println("Enter your selection Below...");
            
            selection = scanner.nextDouble();
            break;
            
        }
        return(selection);
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    
    
}
