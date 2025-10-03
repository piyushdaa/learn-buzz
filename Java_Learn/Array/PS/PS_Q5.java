/**
 * PS_Q5.java - Array Reversal Program
 * 
 * This program demonstrates how to reverse an array by creating a new array
 * and copying elements from the original array in reverse order.
 * The program takes user input for array size and elements, displays the original
 * array, and then displays the reversed array.
 */

// Package declaration - organizes this class within the Java_Learn.Array.PS package
package Java_Learn.Array.PS;

// Import Scanner class for reading user input from console
import java.util.Scanner;

/**
 * PS_Q5 class
 * Main class containing the array reversal logic
 */
public class PS_Q5 {
    
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
        // sc.nextInt() reads the integer entered by user and uses it as array size
        int[] array = new int[sc.nextInt()];
        
        // INPUT SECTION: Loop to populate the array with user-provided values
        // Iterate from index 0 to array.length-1
        for (int i = 0; i< array.length; i++){
            System.out.print("Enter number: ");
            // Store the user input at the current index position
            array[i] = sc.nextInt();
        }
        
        // DISPLAY ORIGINAL ARRAY: Print all elements of the original array
        // Enhanced for-loop (for-each) iterates through each element in the array
        for (int elements: array){
            // Print each element followed by a space
            System.out.print(elements+" ");
        }
        
        // REVERSAL LOGIC SETUP
        // Store the length of the array in a variable (will be decremented in loop)
        int length = array.length;
        
        // Create a new array of the same size to store reversed elements
        int[] reverse = new int[array.length];
        
        // REVERSAL PROCESS: Copy elements from original array to reverse array
        // Loop through each position in the reverse array
        for (int i = 0; i < array.length;i++ ){
            // Copy element from end of original array to current position in reverse array
            // length-1 gives us the index of the last unprocessed element
            reverse[i] = array[length-1];
            
            // Decrement length to move to the next element from the end
            length--;
        }
        
        // Print a newline character to separate original and reversed array output
        System.out.print("\n");
        
        // DISPLAY REVERSED ARRAY: Print all elements of the reversed array
        // Enhanced for-loop iterates through each element in the reverse array
        for (int re: reverse){
            // Print each reversed element followed by a space
            System.out.print(re+" ");
        }
    }
}
