/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import java.util.Random;
import java.util.Scanner;
import byui.cit260.treasure.control.Mathcontrol;

/**
 *
 * @author andrew
 */
public class Checklistcontrol {

    Mathcontrol math = new Mathcontrol();
    Random random = new Random();

    public void SetSail() {
        // TODO - implement Checklistcontrol.SetSail
        throw new UnsupportedOperationException();
    }

    public void PassWhirlpool() {
        // TODO - implement Checklistcontrol.PassWhirlpool
        throw new UnsupportedOperationException();
    }

    public void FixBridge() {
        System.out.println("good job! now you need to complete this equation to fix the bridge...");
        if (math.math()) {
            System.out.println("congradulations");
        } else {
            System.out.println("you fail.");
        }
    }

    public void OpenChest() {
        // TODO - implement Checklistcontrol.OpenChest
        throw new UnsupportedOperationException();
    }

    public void GetLumber() {
        // TODO - implement Checklistcontrol.GetLumber
        throw new UnsupportedOperationException();
    }

    public void BuildBoat() {
        
    }

    public void HelpTurtle() {
        double weight = random.nextInt(50);
        double counter = weight * (1.05);
        if (math.turtle(weight, counter)) {
            System.out.println("congrats");
        } else {
            System.out.println("you fail");
        }
    }

    public void GetBearings() {
        // TODO - implement Checklistcontrol.GetBearings
        throw new UnsupportedOperationException();
    }

}