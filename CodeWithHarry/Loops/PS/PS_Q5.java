//factorial of given number using for loop

package learn-buzz.CodeWithHarry.Loops.PS;

import java.util.Scanner;

public class PS_Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for factorial: ");
        int num = sc.nextInt();

        int fac = 1;
        for (int i = num; i > 0; i--){
            fac = fac*i;
        }
        System.out.printf("Factorial of %d is %d", num, fac);
    }
}
