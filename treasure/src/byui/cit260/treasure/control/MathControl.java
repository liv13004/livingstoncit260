package byui.cit260.treasure.control;

/**
 *
 * @author andrew redone by Braden 4/3/15
 * updated 4/18/15
 */
import byui.cit260.treasure.view.View;
import byui.cit260.treasure.view.CharacterView;
import byui.cit260.treasure.view.ErrorView;
import byui.cit260.treasure.view.GetInput;
import byui.cit260.treasure.view.MapView;
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
                //System.out.println("sorry wrong...");
                ErrorView.display(this.getClass().getName(), "sorry wrong...");
            }
            return (valid);
        }
        if (equation == 1) {
            boolean valid = MathB();
            if (valid == false) {
                //System.out.println("sorry wrong...");
                 ErrorView.display(this.getClass().getName(), "sorry wrong...");
            }
            return (valid);
        } else {
            return (false);
        }
    }

    private boolean MathA() {
       
        double numA ;//= random.nextDouble();
        double x = random.nextInt((int) 51.51);
        double y = random.nextInt((int) 50.49);
        double z = random.nextInt((int) 50.99);
        System.out.printf(" \n \n What is %s * %s - %s \n", x, y, z);
        numA = Double.parseDouble(getinput.getNumber());
        return ((x * y - z) == (numA));
        //return ((x * y - z) == (getinput.getNumber()));

    }

    private boolean MathB() {
        double numB;// = Double.parseDouble(getinput.getNumber());
       double x = random.nextInt((int) 51.51);
        double y = random.nextInt((int) 50.49);
        double z = random.nextInt((int) 50.99);
        System.out.printf("\n \n What is %s - %s / %s \n", x, y, z);
        numB = Double.parseDouble(getinput.getNumber());
        return ((x - y / z) == (numB));
        //return ((x - y / z) == (getinput.getNumber()));
    }

    public void turtle(double userin) {
        
        int i = 0;
       //for(i=0; i<=3; i++) 
        
                    
        
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
    while (i <= 2)
    {       
        if ( turtle == compare){
                     System.out.print(CharacterView.turtpt3);
                     this.MathA();
                     System.out.print("Correct!");
                     break;
            }
        else {   
                        
                      if (i <= 2)  {                       
                        ErrorView.display(this.getClass().getName(), "sorry wrong...try again");
                        //GetInput answer = new GetInput();
                        //answer.display();
                        numC = Double.parseDouble(getinput.getNumber());
                        df.format(numC);
                        compare = numC;
                                if (turtle == compare){
                                    i=0;
                                    }
                                                    
                            i++;
                            }
            
            
                      if (i > 2){
                         ErrorView.display(this.getClass().getName(),"Sorry you've had too many tries,"
                    + "you need to start over.\n"
                    + "\n \n If you need help check the Help Menu for conversion help.");
                         //CharacterView repeat = new CharacterView();
                        // repeat.display();
                       
                         MapView repeat = new MapView();
                         repeat.display();
                    }
                  
            }      
            
        }

    }     
    public void dolphin(double userin) {
        int i = 0;
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
   while (i <= 2)
    {       
        if ( dolphin == compare){
                     System.out.print(CharacterView.turtpt3);
                     this.MathA();
                     System.out.print("Correct!");
                     break;
            }
        else {   
                        
                      if (i <= 2)  {                       
                        ErrorView.display(this.getClass().getName(), "sorry wrong...try again");
                        //GetInput answer = new GetInput();
                        //answer.display();
                        numC = Double.parseDouble(getinput.getNumber());
                        df.format(numC);
                        compare = numC;
                                if (dolphin == compare){
                                    i=0;
                                    }
                                                    
                            i++;
                            }
            
            
                      if (i > 2){
                         ErrorView.display(this.getClass().getName(),"Sorry you've had too many tries,"
                    + "you need to start over.\n"
                    + "\n \n If you need help check the Help Menu for conversion help.");
                         //CharacterView repeat = new CharacterView();
                        // repeat.display();
                       
                         MapView repeat = new MapView();
                         repeat.display();
                    }
                  
            }      
            
        }

    }     
}
