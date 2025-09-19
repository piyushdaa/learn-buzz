package CodeWithHarry.Inputs.PS;

import java.util.Scanner;

public class PS_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        boolean integer = sc.hasNextInt();
        System.out.println("Is this number an integer?");
        System.out.println(integer);

    }
}
