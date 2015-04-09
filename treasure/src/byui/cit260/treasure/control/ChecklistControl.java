/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import java.util.Random;
import java.util.Scanner;
import byui.cit260.treasure.control.MathControl;
import byui.cit260.treasure.model.Checklist;
import byui.cit260.treasure.view.ChecklistDialogView;

/**
 *
 * @author andrew
 */
public class ChecklistControl {

    public static MathControl math = new MathControl();
    Random random = new Random();

    public ChecklistControl() {
       // Checklist checklist = new Checklist(); 
        ChecklistDialogView updateChecklist = new ChecklistDialogView();
    }
   

    public void SetSail() {
        // TODO - implement Checklistcontrol.SetSail
        Checklist checklist = new Checklist(); 
        int stage = 2;
       
        checklist.setProgress(stage);
        boolean valid = true;
    }

    public void PassWhirlpool() {
        // TODO - implement Checklistcontrol.PassWhirlpool

        boolean valid = true;
    }

    public static boolean FixBridge(boolean input) {
        System.out.println("Good Job! Now you need to complete this equation to fix the bridge...");
        if (math.math()) {
            System.out.println("Congratulations");
            boolean complete = input;
            return true;
        } else {
            System.out.println("You Fail.");
            return false;
        }
    }

    public static boolean OpenChest(boolean input) {
        // TODO - implement Checklistcontrol.OpenChest

        boolean complete = input;
        return complete;
    }

    public boolean GetLumber(boolean input) {
        // TODO - implement Checklistcontrol.GetLumber
        Checklist checklist = new Checklist(); 
        int stage = 1;
       
        checklist.setProgress(stage);
        //throw new UnsupportedOperationException();
        return false;
       
       
       
    }

    public static boolean BuildBoat(boolean input) {
         Checklist checklist = new Checklist();
         ChecklistDialogView dialog = new ChecklistDialogView();
       int stage = 3;
       
        checklist.setProgress(stage);
        
       
        
        //boolean complete = input;
        return input;
    }

//    public void HelpTurtle() {
//        double weight = random.nextInt(50);
//        double counter = weight * (1.05);
//        if (math.turtle(weight)) {
//            System.out.println("congrats");
//        } else {
//            System.out.println("you fail");
//        }
//    }

    public static boolean GetBearings(boolean input) {
        boolean complete = input;
        return complete;
        // TODO - implement Checklistcontrol.GetBearings
    }
}
