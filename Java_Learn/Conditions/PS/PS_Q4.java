//To find the day of the week

package Java_Learn.Conditions.PS;

import java.util.Scanner;

public class PS_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (1-7): ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1 -> System.out.print("Monday");
            case 2 -> System.out.print("Tuesday");
            case 3 -> System.out.print("Wednesday");
            case 4 -> System.out.print("Thursday");
            case 5 -> System.out.print("Friday");
            case 6 -> System.out.print("Saturday");
            case 7 -> System.out.print("Sunday");
            default -> System.out.print("Wrong Input!");
        }
    }
}
