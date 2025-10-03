/**
 * PS_Q6.java - Find Maximum Number in Array
 * 
 * This program finds and displays the maximum value in an integer array.
 * It takes user input for array size and elements, displays all elements,
 * then finds and prints the largest number using a simple linear search algorithm.
 */

// Package declaration - organizes this class within the Java_Learn.Array.PS package
package Java_Learn.Array.PS;

// Import Scanner class for reading user input from console
import java.util.Scanner;

/**
 * PS_Q6 class
 * Main class containing the logic to find maximum number in an array
 */
public class PS_Q6 {
    
    /**
     * main method - Entry point of the program
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the number of elements for the array
        System.out.print("Enter number of elements: ");
        
        // Create an integer array with size specified by user input
        int[] array = new int[sc.nextInt()];
        
        // INPUT SECTION: Loop to populate the array with user-provided values
        // Iterate through each index position in the array
        for (int i = 0; i < array.length; i++){
            System.out.print("Enter number: ");
            // Store the user input at current index position
            array[i] = sc.nextInt();
        }
        
        // DISPLAY ARRAY: Print all elements entered by the user
        // Enhanced for-loop (for-each) to iterate through each element
        for (int all:array){
            // Print each element followed by a space
            System.out.print(all+" ");
        }
        
        // FIND MAXIMUM ALGORITHM
        // Initialize max variable with the first element of the array
        // This gives us a baseline to compare other elements against
        int max = array[0];
        
        // Loop through remaining elements starting from index 1
        // Compare each element with current max value
        for (int i = 1; i < array.length; i++){
            // Check if current element is greater than current max
            if (array[i] >max ){
                // Update max to the larger value found
                max = array[i];
            }
        }
        
        // Print the maximum value found in the array
        // \n creates a newline before displaying the result
        System.out.print("\nMax: "+max);
    }
}
