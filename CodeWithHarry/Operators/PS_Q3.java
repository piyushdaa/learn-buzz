/*Use the comparison operator to find out whether a number is greater than the user number or hot.*/

package learn-buzz.CodeWithHarry.Operators;

import java.util.Scanner;

public class PS_Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean com = num > 89;

        System.out.printf("Is %d bigger than 89?\n", num);

        System.out.print(com);

    }
}
