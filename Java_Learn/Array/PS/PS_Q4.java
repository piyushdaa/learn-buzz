/**
 * Program to add two matrices of size 2x3
 * This program takes input for two 2x3 matrices and displays their sum
 */

// Package declaration for organizing the code structure
package Java_Learn.Array.PS;

// Import Scanner class for taking user input
import java.util.Scanner;

// Main class definition
public class PS_Q4 {
    
    // Main method - entry point of the program
    public static void main(String[] args) {
        
        // Create Scanner object to read user input from console
        Scanner sc = new Scanner(System.in);
        
        // Declare first 2x3 matrix
        int[][] matrix = new int[2][3];
        
        // Declare second 2x3 matrix
        int[][] matrix2 = new int[2][3];
        
        // Declare result matrix to store sum of two matrices
        int[][] result = new int[2][3];
        
        // Initialize counter for rows (i ranges from 0 to 3 to handle both matrices)
        int i = 0;
        
        // Outer loop to input values for both matrices (4 iterations for 2 rows each)
        while (i < 4) {
            // Initialize counter for columns
            int j = 0;
            
            // Inner loop to iterate through columns (3 columns)
            while (j < 3) {
                // Check if we're filling first matrix (rows 0-1)
                if (i < 2) {
                    System.out.printf("Enter number for Matrix 1 [%d][%d]: ", i + 1, j + 1);
                    matrix[i][j] = sc.nextInt();  // Store value in first matrix
                } else {
                    // Filling second matrix (rows 2-3, mapped to 0-1)
                    System.out.printf("Enter number for Matrix 2 [%d][%d]: ", i + 1 - 2, j + 1);
                    matrix2[i - 2][j] = sc.nextInt();  // Store value in second matrix
                }
                j++;  // Move to next column
            }
            i++;  // Move to next row
        }
        
        // Reset counter to display both matrices
        i = 0;
        
        // Outer loop to display both matrices (4 iterations for 2 rows each)
        while (i < 4) {
            // Initialize counter for columns
            int j = 0;
            
            // Inner loop to iterate through columns
            while (j < 3) {
                // Display first matrix elements
                if (i < 2) {
                    System.out.printf("%d ", matrix[i][j]);
                    // Add extra spacing after first matrix
                    if (i == 1 && j == 2) {
                        System.out.print("\n\n");
                    }
                } else {
                    // Display second matrix elements
                    System.out.printf("%d ", matrix2[i - 2][j]);
                }
                j++;  // Move to next column
            }
            System.out.print("\n");  // New line after each row
            i++;  // Move to next row
        }
        
        // Add spacing before result
        System.out.print("\n");
        
        // Reset counter to calculate and display result
        i = 0;
        
        // Outer loop to add matrices and display result
        while (i < 2) {
            // Initialize counter for columns
            int j = 0;
            
            // Inner loop to iterate through columns
            while (j < 3) {
                // Add corresponding elements from both matrices
                result[i][j] = matrix[i][j] + matrix2[i][j];
                
                // Display the result element
                System.out.printf("%d ", result[i][j]);
                j++;  // Move to next column
            }
            System.out.print("\n\n");  // Double new line after each result row
            i++;  // Move to next row
        }
    }
}
