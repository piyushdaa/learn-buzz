//WAP to calculate CGPA using marks of three subjects (out of 100).

package Java_Learn.Inputs.PS;

import java.util.Scanner;

public class PS_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subjects...");
        System.out.print("Enter Subject 1: ");
        String sub_1 = sc.next();
        System.out.print("Enter Subject 2: ");
        String sub_2 = sc.next();
        System.out.print("Enter Subject 3: ");
        String sub_3 = sc.next();
        System.out.println("Enter Marks (out of 100)...");
        System.out.print(sub_1 + " : ");
        float marks_1 = sc.nextFloat();
        System.out.print(sub_2 + " : ");
        float marks_2 = sc.nextFloat();
        System.out.print(sub_3 + " : ");
        float marks_3 = sc.nextFloat();

        double cgpa = ((marks_1 + marks_2 + marks_3) / 3) / 9.5;

        System.out.printf("CGPA: %.2f", cgpa);
    }
}
