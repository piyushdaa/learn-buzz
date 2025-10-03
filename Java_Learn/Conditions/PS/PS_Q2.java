//Student Pass/Fail Checker
//Write a program to find out whether a Student is pass or fail: if it requires total 40%. and I at least 33% in each subject to pass.Assume 3 Subjects and take marks as an input from the user.

// Package declaration - organizes the class into a folder structure
package Java_Learn.Conditions.PS;

// Import Scanner class to read user input from console
import java.util.Scanner;

// Main class definition
public class PS_Q2 {
    public static void main(String[] args) {
        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Display program title and instructions to user
        System.out.println("Calculation of 3 subjects...");
        System.out.println("Marks (out of 100)");
        
        // Get first subject name from user
        System.out.print("Enter Subject 1: ");
        String sub_1 = sc.next();  // Read subject name
        
        // Get marks for first subject
        System.out.print("Enter marks: ");
        float marks_1 = sc.nextInt();  // Read marks as integer and store in float variable
        
        // Get second subject name from user
        System.out.print("Enter Subject 2: ");
        String sub_2 = sc.next();  // Read subject name
        
        // Get marks for second subject
        System.out.print("Enter marks: ");
        float marks_2 = sc.nextInt();  // Read marks as integer and store in float variable
        
        // Get third subject name from user
        System.out.print("Enter subject 3: ");
        String sub_3 = sc.next();  // Read subject name
        
        // Get marks for third subject
        System.out.print("Enter marks: ");
        float marks_3 = sc.nextInt();  // Read marks as integer and store in float variable
        
        // Calculate overall percentage
        // Formula: (sum of all marks / total possible marks) * 100
        // Total possible marks = 100 * 3 = 300
        double percentage = (marks_1 + marks_2 + marks_3) / 300 * 100;
        
        // Display calculated percentage with 2 decimal places
        System.out.printf("Percentage: %.2f\n", percentage);
        
        // Check pass/fail criteria:
        // 1. Each subject must have more than 33 marks (minimum passing marks per subject)
        // 2. Overall percentage must be greater than 40% (minimum overall percentage)
        // Student passes only if ALL conditions are true
        if (marks_1 > 33 && marks_2 > 33 && marks_3 > 33 && percentage > 40) {
            System.out.print("You Pass!");
        } else {
            // If any condition fails, student fails
            System.out.print("You fail");
        }
    }
}
