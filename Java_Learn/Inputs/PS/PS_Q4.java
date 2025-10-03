// Program to convert kilometers to miles

package Java_Learn.Inputs.PS;

import java.util.Scanner;

public class PS_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input

        // Prompt user for distance in kilometers
        System.out.print("Enter Distance(kms) : ");
        float distance = sc.nextFloat();

        // Convert kilometers to miles (1 mile = 1.60934 km)
        double miles = distance / 1.60934;

        // Display result in miles with two decimal places
        System.out.printf("Miles : %.2f", miles);
    }
}