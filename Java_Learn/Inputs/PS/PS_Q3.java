// Program to greet the user with "Hello <user>, have a good day"

package Java_Learn.Inputs.PS;

import java.util.Scanner;

public class PS_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = sc.next();

        // Display greeting message
        System.out.printf("Hello %s, Have A Good Day!", name);
    }
}