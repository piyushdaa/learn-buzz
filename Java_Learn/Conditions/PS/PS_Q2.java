//Write a program to find out whether a Student is pass or fail: if it requires total 40%. and I at least 33% in each subject to pass.Assume 3 Subjects and take marks as an input from the user.

package Java_Learn.Conditions.PS;

import java.util.Scanner;

public class PS_Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculation of 3 subjects...");

        System.out.println("Marks (out of 100)");

        System.out.print("Enter Subject 1: ");
        String sub_1 = sc.next();
        System.out.print("Enter marks: ");
        float marks_1 = sc.nextInt();

        System.out.print("Enter Subject 2: ");
        String sub_2 = sc.next();
        System.out.print("Enter marks: ");
        float marks_2 = sc.nextInt();

        System.out.print("Enter subject 3: ");
        String sub_3 = sc.next();
        System.out.print("Enter marks: ");
        float marks_3 = sc.nextInt();

        double percentage = (marks_1 + marks_2 + marks_3) / 300 * 100;

        System.out.printf("Percentage: %.2f\n", percentage);

        if (marks_1 > 33 && marks_2 > 33 && marks_3 > 33 && percentage > 40) {
            System.out.print("You Pass!");
        } else {
            System.out.print("You fail");
        }


    }
}
