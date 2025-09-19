//Write a jave program to encrypt a grade by adding 8 to it!. Decrypt it show the correct grade.

package CodeWithHarry.Operators;

import java.util.Scanner;


public class PS_Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        float grade = sc.nextFloat();
        System.out.println("Encrypted Form:");
        System.out.println(grade + 8);
        System.out.println("Decrypted Form: ");
        System.out.println(grade);
    }
}
