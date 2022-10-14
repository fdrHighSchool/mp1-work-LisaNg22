import java.util.Scanner;

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

} // end class
