/**
 * Program to calculate average marks of all students using for-each loop
 * This program takes input for number of students and their marks, then computes the average
 */

// Package declaration for organizing the code structure
package Java_Learn.Array.PS;

// Import Scanner class for taking user input
import java.util.Scanner;

// Main class definition
public class PS_Q3 {
    
    // Main method - entry point of the program
    public static void main(String[] args) {
        
        // Create Scanner object to read user input from console
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the total number of students
        System.out.print("Enter number of students: ");
        
        // Create a float array with size equal to number of students entered by user
        float[] marks = new float[sc.nextInt()];
        
        // Initialize counter variable for populating the marks array
        int i = 0;
        
        // Loop to get marks for each student
        while (i < marks.length) {
            System.out.print("Enter marks: ");
            marks[i] = sc.nextFloat();  // Store marks in array at current index
            i++;  // Move to next student
        }
        
        // Initialize variable to accumulate total marks of all students
        float total_marks = 0;
        
        // For-each loop to iterate through all marks and calculate sum
        for (float students: marks) {
            total_marks += students;  // Add each student's marks to total
        }
        
        // Calculate and display the average marks
        System.out.print("Total marks: " + (total_marks/marks.length));
    }
}
