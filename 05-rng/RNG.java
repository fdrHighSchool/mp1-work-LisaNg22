
/**
 * Write a description of class Rng here.
 *
 * Lisa Ng
 * 10-19-22
 */

import java.util.Random;
import java.util.Scanner; 
// Imported classes

public class RNG {  
    public static void main(String[] args) {

   System.out.println("What mode do you want? Choose between easy, meduim, or hard."); // Ask user for the mode they prefer

   Scanner mode = new Scanner (System.in);
   String userMode = mode.nextLine(); // Gets user input for what mode they want

// Code for easy mode
   
 if (userMode.equals("easy")){
   Random random = new Random();
   int easyNumber = random.nextInt(10);// Easy random number
   System.out.println("I am thinking of a number between 1 and 10 (including both). Can you guess what it is? Type your guess!");
   Scanner easyInput = new Scanner (System.in);
   int easyGuess = easyInput.nextInt();
     
   System.out.println("Your guess is: " + easyGuess);
     
   if (easyGuess == easyNumber) {
     System.out.println("Correct!");
     }
       
   else if (easyNumber > easyGuess) {
     System.out.println("The number I was thinking of is: "+ easyNumber);
     System.out.println("You were off by:"+ (easyNumber - easyGuess));
     }

   else { 
     System.out.println("The number I was thinking of is: " + easyNumber);  
     System.out.println("You were off by:"+ (easyGuess - easyNumber));
     }
 }
   
// Code for medium mode
 
 else if (userMode.equals("medium")){
   Random random = new Random();
   int mediumNumber = random.nextInt(50);// Medium random number
   System.out.println("I am thinking of a number between 1 and 50 (including both). Can you guess what it is? Type your guess!");
   Scanner mediumInput = new Scanner (System.in);
   int mediumGuess = mediumInput.nextInt();
     
   System.out.println("Your guess is: " + mediumGuess);
     
   if (mediumGuess == mediumNumber) {
     System.out.println("Correct!");
     }
       
   else if (mediumNumber > mediumGuess) {
     System.out.println("The number I was thinking of is: "+mediumNumber);
     System.out.println("You were off by:"+ (mediumNumber - mediumGuess));
     }

   else { 
     System.out.println("The number I was thinking of is: " + mediumNumber);  
     System.out.println("You were off by:"+ (mediumGuess - mediumNumber));
     }
 }

// Code for hard mode

 else {
   Random random = new Random();
   int hardNumber = random.nextInt(100);// Hard random number
     
   System.out.println("I am thinking of a number between 1 and 100 (including both). Can you guess what it is? Type your guess!");

   Scanner hardInput = new Scanner (System.in);
   int hardGuess = hardInput.nextInt();
    
   System.out.println("Your guess is: " + hardGuess);
     
   if (hardGuess == hardNumber) { // Start of if statement
     System.out.println("Correct!");
     } // end of if statement 

   else if (hardNumber > hardGuess) { // Start of else if statement
     System.out.println("The number I was thinking of is: "+ hardNumber);
     System.out.println("You were off by:"+ (hardNumber - hardGuess));
     } // end of else if statement
     
   else {
     System.out.println("The number I was thinking of is: " + hardNumber);  
     System.out.println("You were off by:"+ (hardGuess - hardNumber));
     }
  }
}
}