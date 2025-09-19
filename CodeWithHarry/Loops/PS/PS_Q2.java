//sum of first n even number using while loop

package CodeWithHarry.Loops.PS;

import java.util.Scanner;

public class PS_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter terms: ");
        int terms = sc.nextInt();
        int i = 0;
        int even = 0;
        int count = 0;
        while (count <= terms) {
            if (i % 2 == 0) {
                count++;
                even += i;
            }
            i++;
        }
        System.out.printf("Sum of %d numbers: %d", terms, even);
//        System.out.print("Enter terms: ");
//        int terms = sc.nextInt();
//        System.out.printf("Sum: %d", terms*(terms+1));
    }
}
