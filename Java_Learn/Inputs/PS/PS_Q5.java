// Program to check if the user input is an integer

package Java_Learn.Inputs.PS;

import java.util.Scanner;

public class PS_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        // Prompt user to enter a value
        System.out.print("Enter a integer: ");

        // Check whether the next input is an integer
        boolean integer = sc.hasNextInt();

        // Display result
        System.out.println("Is this number an integer?");
        System.out.println(integer);
    }
}