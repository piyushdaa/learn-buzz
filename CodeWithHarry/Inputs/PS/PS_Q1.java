//Write a program to sum three numbers in Java

package learn-buzz.CodeWithHarry.Inputs.PS;

import java.util.Scanner;

public class PS_Q1 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        int num_3 = sc.nextInt();

        int sum = num_1 + num_2 + num_3;

        System.out.println("Sum = " + sum);
    }
}
