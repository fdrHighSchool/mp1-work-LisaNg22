
/**
 * Write a description of class Lanternfly here.
 *
 * Author:Lisa Ng
 * 9-30-22
 */
import java.util.Scanner;
public class Lanternfly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this year? ");
        int num = input.nextInt();
        
        if (num < 10) {
            System.out.println("You can do better than that! Try harder!");
        } // end if statement
        else if (num >= 100){
           System.out.println("Wow, You did an unbelievable job!");
         } // end of else if statement 
        else {
            System.out.println("Thanks for doing your part");
        } // end else statement
input.close(); // close scanner class
    } // end main method

} // end class
