package byui.cit260.treasure.control;

/**
 *
 * @author andrew redone by Braden 4/3/15
 */
import byui.cit260.treasure.view.View;
import byui.cit260.treasure.view.CharacterView;
import byui.cit260.treasure.view.ErrorView;
import byui.cit260.treasure.view.GetInput;
import java.text.DecimalFormat;
import java.util.Random;

public class MathControl {

    Random random = new Random();
    GetInput getinput = new GetInput();
//    CharacterView cview = new CharacterView();

    public boolean math() {
        int equation = random.nextInt(2);
        if (equation == 0) {
            boolean valid = MathA();
            if (valid == false) {
                System.out.println("sorry wrong...");
                ErrorView.display(this.getClass().getName(), "sorry wrong...");
            }
            return (valid);
        }
        if (equation == 1) {
            boolean valid = MathB();
            if (valid == false) {
                System.out.println("sorry wrong...");
                 ErrorView.display(this.getClass().getName(), "sorry wrong...");
            }
            return (valid);
        } else {
            return (false);
        }
    }

    private boolean MathA() {
        double numA ;//= random.nextDouble();
        int x = random.nextInt(50);
        int y = random.nextInt(50);
        int z = random.nextInt(50);
        System.out.printf(" \n \n What is %s * %s - %s \n", x, y, z);
        numA = Double.parseDouble(getinput.getNumber());
        return ((x * y - z) == (numA));
        //return ((x * y - z) == (getinput.getNumber()));

    }

    private boolean MathB() {
        double numB;// = Double.parseDouble(getinput.getNumber());
        int x = random.nextInt(50);
        int y = random.nextInt(50);
        int z = random.nextInt(50);
        System.out.printf("\n \n What is %s - %s / %s \n", x, y, z);
        numB = Double.parseDouble(getinput.getNumber());
        return ((x - y / z) == (numB));
        //return ((x - y / z) == (getinput.getNumber()));
    }

    public void turtle(double userin) {
       int turtKg = random.nextInt(50);
        double turtCw = 1.05;
        double turtleTot = 0 ;
        System.out.print((turtKg) + " " + (CharacterView.turtpt2));
         double turtle = ((turtKg * 2.20462) * (turtCw));
           DecimalFormat df = new DecimalFormat("#.00");
        String format = df.format(turtle);
        turtle = Double.parseDouble(format);
         double numC = Double.parseDouble(getinput.getNumber());
            df.format(numC);
           double compare = numC;    
    if ( turtle == compare){
                     System.out.print(CharacterView.turtpt3);
                     this.MathA();
        }
    else {   
        System.out.println("sorry wrong...");
                ErrorView.display(this.getClass().getName(), "sorry wrong...");
                this.turtle(turtle);
                
    }
      
            
    }

    public void dolphin(double userin) {
        int dolphKm = random.nextInt(50);
        double dolphEd = 1.15;
        double dolphinTot = 0 ;
        
        //CharacterView cview = new CharacterView();
        //cview.display();
            System.out.print((dolphKm) + " " + (CharacterView.dolphpt1));
        //System.out.printf(" " + "kilograms." + "\n \n But the counterweight is measured in pounds....\n \n");
        //, ((turtle * 100) / 100));
        //System.out.println("/n /n How many pounds should be placed on the counter weight to make it 5% higher than the turtles weight? \n /\n");
           double dolphin = (((dolphKm * 1.60934) * (dolphEd)) / (3.21868));
           DecimalFormat df = new DecimalFormat("#.00");
        String format = df.format(dolphin);
        dolphin = Double.parseDouble(format);
         double numC = Double.parseDouble(getinput.getNumber());
            df.format(numC);
           double compare = numC;    
    if ( dolphin == compare){
                     System.out.print(CharacterView.dolphpt2);
                     this.MathB();
        }
    else {   
        System.out.println("sorry wrong...");
                ErrorView.display(this.getClass().getName(), "sorry wrong...");
                this.dolphin(dolphin);
                
        
    }
}
}
