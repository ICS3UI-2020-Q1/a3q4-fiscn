import java.util.Scanner; 

/**
 *  a program that will ask the user for a positive integer. If that number is between 1 and 10 inclusively, the program will print out the “written form” of the number. If it is not within that range, the computer prints out “not in the range”.
 * @author Neil Fischer
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create Scanner for user input 
    Scanner input = new Scanner(System.in); 

    //Prompt the user to insert an integer 
    System.out.println("Please enter a positive integer:"); 
    int Positive = input.nextInt(); 

    switch(Positive){
    case 1: 
    System.out.println("One"); 
    break; 
    case 2: 
    System.out.println("Two"); 
    break;
    case 3: 
    System.out.println("Three"); 
    break;
    case 4: 
    System.out.println("Four"); 
    break;
    case 5: 
    System.out.println("Five"); 
    break;
    case 6: 
    System.out.println("Six"); 
    break; 
    case 7:
    System.out.println("Seven"); 
    break; 
    case 8: 
    System.out.println("Eight"); 
    break;
    case 9: 
    System.out.println("Nine"); 
    break; 
    case 10:
    System.out.println("Ten"); 
    break; 
    default: 
    System.out.println("Not in range");
    }
    
  }
}
