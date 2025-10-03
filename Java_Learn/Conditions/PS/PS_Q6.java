//Website Domain Identifier
//Program to identify website type based on domain extension
// .com --> commercial website
// .org -> organisation website
// .in -> India Website

// Package declaration - organizes the class into a folder structure
package Java_Learn.Conditions.PS;

// Import Scanner class to read user input from console
import java.util.Scanner;

// Main class definition
public class PS_Q6 {
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a domain extension (like .com, .org, .in)
        System.out.print("Enter domain name: ");
        
        // Read the domain extension entered by user as a string
        String domain = sc.next();
        
        // Use switch statement to check domain type
        // Switch is efficient for checking one variable against multiple fixed values
        switch (domain) {
            // Case 1: If user enters ".com" - indicates a commercial website
            case ".com":
                System.out.print("Commercial Website...");
                break;  // Break exits the switch statement after executing this case
            
            // Case 2: If user enters ".org" - indicates an organization website
            case ".org":
                System.out.println("Organisation Website...");
                break;  // Break prevents fall-through to next case
            
            // Case 3: If user enters ".in" - indicates an Indian website
            case ".in":
                System.out.println("Indian Website...");
                break;  // Break stops further case checking
            
            // Default case: If user enters any other domain extension
            // This executes when none of the above cases match
            default:
                System.out.println("No recognized domain");
        }
    }
}
