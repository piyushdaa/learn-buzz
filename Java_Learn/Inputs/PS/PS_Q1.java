// Program to sum three numbers entered by the user

package Java_Learn.Inputs.PS;

import java.util.Scanner;

public class PS_Q1 {
    public static void main(String[] args) {
        // Prompt the user to enter three numbers
        System.out.println("Enter three numbers:");
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Read three integer numbers from the user
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int num_3 = sc.nextInt();

        // Calculate the sum of the three numbers
        int sum = num_1 + num_2 + num_3;

        // Output the result
        System.out.println("Sum = " + sum);
    }
}