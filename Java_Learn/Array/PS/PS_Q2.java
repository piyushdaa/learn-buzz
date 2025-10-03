/**
 * Program to check whether a number is present in an array or not
 * This program takes user input to populate an array, then searches for a specific number
 */

// Package declaration for organizing the code structure
package Java_Learn.Array.PS;

// Import Scanner class for taking user input
import java.util.Scanner;

// Main class definition
public class PS_Q2 {
    
    // Main method - entry point of the program
    public static void main(String[] args) {
        
        // Initialize an integer array of size 5 to store numbers
        int[] arr = new int[5];
        
        // Create Scanner object to read user input from console
        Scanner sc = new Scanner(System.in);
        
        // Initialize counter variable to track array index during input
        byte i = 0;
        
        // Loop to populate array with user-provided numbers
        while (i < arr.length) {
            System.out.print("Enter number for array: ");
            arr[i] = sc.nextInt();  // Read integer from user and store in array
            i++;  // Move to next index
        }
        
        // Prompt user to enter the number they want to search for
        System.out.print("Enter number to find: ");
        int num = sc.nextInt();  // Store the number to be searched
        
        // Flag variable to track if number is found (0 = not found, 1 = found)
        int flag = 0;
        
        // Reset counter to start searching from beginning of array
        i = 0;
        
        // Loop through array to search for the target number
        while (i < arr.length) {
            // Check if current element matches the number we're looking for
            if (arr[i] == num) {
                flag = 1;  // Set flag to indicate number was found
                break;     // Exit loop immediately as we found the number
            }
            i++;  // Move to next element
        }
        
        // Display search result based on flag value
        if (flag == 1) {
            // Number was found - display success message with position
            System.out.printf("Found ya!\nAt index %d, right?", i+1);
        } else {
            // Number was not found in the array
            System.out.print("Not Found!...I will try again!!");
        }
    }
}
