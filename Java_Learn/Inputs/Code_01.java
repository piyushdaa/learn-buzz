// Program to add two numbers entered by the user
package Java_Learn.Inputs;

import java.util.Scanner; // Import Scanner class for user input

public class Code_01 {
    public static void main(String[] args) {
        // Print heading for the program
        System.out.print("Adding Two Numbers:\n");

        // Declare variables to store user input
        int num1, num2;

        // Create Scanner object to read input from console
        Scanner code = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.println("Enter a number: ");
        num1 = code.nextInt(); // Read the first integer

        // Prompt user to enter the second number
        System.out.println("Enter another number: ");
        num2 = code.nextInt(); // Read the second integer

        // Calculate the sum of two numbers
        int sum = num1 + num2;

        // Display the sum to the user
        System.out.println("Sum of two numbers is : " + sum);

        // Check if the next input is an integer
        System.out.println("Enter Only Number"); // Prompt for integer input
        boolean com = code.hasNextInt(); // Check if the next token is an integer
        System.out.println(com); // Print result (true if integer, false otherwise)

        // Close the Scanner object to free resources
        code.close();
    }
}