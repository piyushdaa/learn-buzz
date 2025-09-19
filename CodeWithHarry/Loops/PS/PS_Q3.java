//Multiplication Table

package learn-buzz.CodeWithHarry.Loops.PS;

import java.util.Scanner;


public class PS_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for multiplication table: ");
        int num = sc.nextInt();

        int i = 1;
        do {
            System.out.printf("%d X %d = %d\n", num, i, num * i);
            i++;
        } while (i <= 10);
    }
}
