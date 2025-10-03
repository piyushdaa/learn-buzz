/*Income Tax Calculator
Calculate income tax paid by an employee to the Government as per the sets mentioned below:
Income Slab  Tax
2.5L-5.0L 5%
5.0L-10.0L 20%
Above 10.0L 30%
Note that there is no tax below 2.5L. Take input amount as an input from the user.*/

// Package declaration - organizes the class into a folder structure
package Java_Learn.Conditions.PS;

// Import Scanner class to read user input from console
import java.util.Scanner;

// Main class definition
public class PS_Q3 {
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter their salary in lakhs
        System.out.print("Enter salary(in lakhs): ");
        
        // Read the salary value as a float (decimal number)
        float sal = sc.nextFloat();
        
        // Validate input: Check if salary is negative (invalid input)
        if (sal < 0) {
            System.out.print("Wrong Input...");
        } 
        // Check if salary is between 0 and 2.5 lakhs (no tax bracket)
        else if (0 < sal && sal < 2.5) {
            System.out.print("No Tax!");
        } 
        // Check if salary is between 2.5L and 5L (5% tax bracket)
        else if (2.5 < sal && sal < 5) {
            // Calculate 5% tax and display with 2 decimal places
            System.out.printf("Tax paid: %.2fL", (sal * 5) / 100);
        } 
        // Check if salary is between 5L and 10L (20% tax bracket)
        else if (5 < sal && sal < 10) {
            // Calculate 20% tax and display with 2 decimal places
            System.out.printf("Tax paid: %.2fL", (sal * 20) / 100);
        } 
        // If salary is above 10L (30% tax bracket)
        else if (10 < sal) {
            // Calculate 30% tax and display with 2 decimal places
            System.out.printf("Tax paid : %.2fL", (sal * 30) / 100);
        }
    }
}
