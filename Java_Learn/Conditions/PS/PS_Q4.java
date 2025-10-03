//Day of the Week Finder
//Program to find the day of the week based on user input (1-7)

// Package declaration - organizes the class into a folder structure
package Java_Learn.Conditions.PS;

// Import Scanner class to read user input from console
import java.util.Scanner;

// Main class definition
public class PS_Q4 {
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a number between 1 and 7
        System.out.print("Enter number (1-7): ");
        
        // Read the user's choice as an integer
        int choice = sc.nextInt();
        
        // Use switch statement to match the number with corresponding day
        // Switch is ideal when checking one variable against multiple specific values
        switch (choice) {
            // Case 1: If user enters 1, display Monday
            case 1 -> System.out.print("Monday");
            
            // Case 2: If user enters 2, display Tuesday
            case 2 -> System.out.print("Tuesday");
            
            // Case 3: If user enters 3, display Wednesday
            case 3 -> System.out.print("Wednesday");
            
            // Case 4: If user enters 4, display Thursday
            case 4 -> System.out.print("Thursday");
            
            // Case 5: If user enters 5, display Friday
            case 5 -> System.out.print("Friday");
            
            // Case 6: If user enters 6, display Saturday
            case 6 -> System.out.print("Saturday");
            
            // Case 7: If user enters 7, display Sunday
            case 7 -> System.out.print("Sunday");
            
            // Default case: If user enters any number outside 1-7, display error message
            default -> System.out.print("Wrong Input!");
        }
    }
}
