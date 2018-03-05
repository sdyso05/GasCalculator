/*
*Program to determine if the user will be able to travel to the next
*service station without running out of fuel
*/
package calculator;

/**
 *
 * @author sdyso05
 */
import java.util.Scanner;

public class gasCalculator {
    public static void main(String[] args) {
        // declare double-type variables
        double gasRemaining;
        double milesRemaining;
        double milesperGallon;
     
        
      // Initial Message
        System.out.println("**Will you make it??**");
        System.out.println ("Please enter all information in integers)");
                
        
        
        Scanner userInputScanner = new Scanner(System.in);
        
        // prompt the user for gas remaining
        System.out.println("Enter the gallons of fuel remaining");
        
        // use the Scanner object to read a double value from the console
        gasRemaining = userInputScanner.nextDouble();
        
        
        //prompt the user miles left
        System.out.println("Enter the distance in miles remaining to your destination");
        
        // use the Scanner object to read a double value from the console
        milesRemaining = userInputScanner.nextDouble();
        
        //prompt user for Miles per gallon
        System.out.println("Enter the estimated miles per gallon yield of your car");
        
        milesperGallon = userInputScanner.nextDouble();
        
        //see whether user input is true or false
        if(milesRemaining>(gasRemaining*milesperGallon)){
            System.out.println("You will run out of fuel"+(milesRemaining-(gasRemaining*milesperGallon))+" miles from the next service station.");
            System.out.println("In order to reach the next service staion your car would need to yield "+(milesRemaining/gasRemaining)+" miles per gallon.");
        }
        else{
   
            System.out.println("Don't worry, you'll make it to the next service station");
            
        } // close if/else
        
    } // close main
} // close class
