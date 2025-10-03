/**
 * PS_Q8.java - Check if Array is Sorted
 * 
 * This program determines whether an array is sorted in ascending order,
 * descending order, or unsorted. It takes user input for array elements,
 * displays them, and then checks the ordering relationship between consecutive elements.
 */

// Package declaration - organizes this class within the Java_Learn.Array.PS package
package Java_Learn.Array.PS;

// Import Scanner class for reading user input from console
import java.util.Scanner;

/**
 * PS_Q8 class
 * Main class containing the logic to check if an array is sorted
 */
public class PS_Q8 {
    
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
        
        // COMBINED INPUT AND DISPLAY LOOP
        // Loop runs for twice the array length:
        // - First half (i < array.length): Input phase - collect elements from user
        // - Second half (i >= array.length): Display phase - print elements back
        for (int i = 0; i < (array.length)*2; i++) {
            
            // INPUT PHASE: When i is less than array length
            if (i < array.length) {
                System.out.print("Enter number: ");
                // Store user input at index i
                array[i] = sc.nextInt();
            } 
            // DISPLAY PHASE: When i is >= array length
            else {
                // Print element by calculating its index: (i - array.length)
                // For example, when i=5 and array.length=5, we print array[0]
                System.out.print(array[i - array.length] + " ");
            }
        }
        
        // SORTING CHECK ALGORITHM
        // Initialize two boolean flags to track potential sorting patterns
        // asc = true if array could be in ascending order (or has equal elements)
        boolean asc = true;
        // dsc = true if array could be in descending order (or has equal elements)
        boolean dsc = true;
        
        // Loop through array comparing consecutive elements
        // Only need to check up to second-to-last element (array.length-1)
        for (int i = 0; i < array.length-1; i++){
            
            // Check if current element is greater than next element
            if (array[i] > array[i+1]){
                // If so, array cannot be in ascending order
                asc = false;
            }
            // Check if current element is less than next element
            else if (array[i] < array[i+1]){
                // If so, array cannot be in descending order
                dsc = false;
            }
            // Note: If elements are equal (array[i] == array[i+1]),
            // neither flag changes - it's valid in both ascending and descending
        }
        
        // OUTPUT RESULTS: Determine and display the sorting status
        // Check if array is in ascending order (asc flag still true)
        if (asc){
            System.out.print("\nAscending order...");
        }
        // Check if array is in descending order (dsc flag still true)
        else if (dsc){
            System.out.print("\nDescending Order...");
        }
        // If both flags are false, array has mixed ordering (unsorted)
        else{
            System.out.print("\nUnsorted...");
        }
    }
}
