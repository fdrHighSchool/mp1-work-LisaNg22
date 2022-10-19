import java.util.Scanner;
import java.util.Random;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    
    //get user's favorite number (int)
    System.out.print("Enter your favorite number: ");
    int favoriteNumber = s.nextInt();
    
    //find out id user is a student or teacher
    System.out.print("Are you a student or a teacher?: ");
    String role = s.next();

    // test output
if (role.equals("student")){
    System.out.println("Hello " + firstName + initialize(lastName) + favoriteNumber + "@nycstudents.net");
}//end if statement
else{
System.out.println("Hello " + initialize(firstName) + lastName + favoriteNumber + "@schools.nyc.gov");
}//end else statement

generatePassword(0);

s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method
  /*
   * Name: generatePassword
   * Purpose: generate a random password for user
   * Input: int (length)
   * Return: a password
   */
  public static String generatePassword(int length) {
    String password = "";
    
    for(int i = 0 ; i< length; i++) {
        //generate a random number
    
        //65-90 capital letters
        int rand = (char)(int)(Math.random()*(90-65+1)+ 65);
        //97-122 lower case
        //33-47 special symbols
        //convert ASCII to char
        char c = (char)rand;
        System.out.println(rand + " " + c);
    }
    
    //add the char to the password String
    //generate password
    return password;
  } // end generatePassword

} // end class
