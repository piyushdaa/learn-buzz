//Leap Year Checker
//Program to find if the entered year is a leap year or not

// Package declaration - organizes the class into a folder structure
package Java_Learn.Conditions.PS;

// Import Scanner class to read user input from console
import java.util.Scanner;

// Main class definition
public class PS_Q5 {
    public static void main(String[] args){
        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter a year
        System.out.print("Enter a year: ");
        
        // Read the year entered by user as an integer
        int year = sc.nextInt();
        
        // Check if the year is a leap year using leap year rules:
        // Rule 1: Year must be divisible by 4 (year % 4 == 0)
        // Rule 2: If divisible by 100, it's NOT a leap year (year % 100 != 0)
        // Exception: Years divisible by 400 are leap years (not handled in this simplified version)
        // Examples: 2020 is leap (divisible by 4, not by 100), 1900 is not (divisible by 100)
        if (year%4 == 0 && year%100 != 0){
            // If both conditions are true, it's a leap year
            System.out.printf("%d is Leap Year.",year);
        }else {
            // Otherwise, it's not a leap year
            System.out.printf("%d is not Leap Year.",year);
        }
    }
}
