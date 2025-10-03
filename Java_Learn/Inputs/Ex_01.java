// Program to calculate percentage marks for 5 subjects (each out of 100)

package Java_Learn.Inputs;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {

        System.out.println("Calculation for Marks");

        Scanner marks = new Scanner(System.in);

        // Input subject names
        System.out.println("Enter subjects... ");

        System.out.print("\nSubject 1: ");
        String sub_1 = marks.next();

        System.out.print("Subject 2: ");
        String sub_2 = marks.next();

        System.out.print("Subject 3: ");
        String sub_3 = marks.next();

        System.out.print("Subject 4: ");
        String sub_4 = marks.next();

        System.out.print("Subject 5: ");
        String sub_5 = marks.next();

        // Input marks for each subject
        System.out.println("\nEnter Marks (out of 100)...");

        System.out.print(sub_1 + " : ");
        int marks_1 = marks.nextInt();

        System.out.print(sub_2 + " : ");
        int marks_2 = marks.nextInt();

        System.out.print(sub_3 + " : ");
        int marks_3 = marks.nextInt();

        System.out.print(sub_4 + " : ");
        int marks_4 = marks.nextInt();

        System.out.print(sub_5 + " : ");
        int marks_5 = marks.nextInt();

        // Calculate total marks and percentage
        double sum = marks_1 + marks_2 + marks_3 + marks_4 + marks_5;
        double total_marks = (sum / 500) * 100;

        // Display the percentage
        System.out.println("Marks: " + total_marks + "%");
    }
}