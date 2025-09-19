/*Calculate income tax paid by an employee to the Government as per the sets mentioned below:
Income Slab  Tax
2.5L-5.0L 5%
5.0L-10.0L 20%
Above 10.0L 30%
Note that there is no tax below 2.5L. Take input amount as an input from the user.*/

package learn-buzz.CodeWithHarry.Conditions.PS;

import java.util.Scanner;

public class PS_Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary(in lakhs): ");
        float sal = sc.nextFloat();

        if (sal < 0) {
            System.out.print("Wrong Input...");
        } else if (0 < sal && sal < 2.5) {
            System.out.print("No Tax!");
        } else if (2.5 < sal && sal < 5) {
            System.out.printf("Tax paid: %.2fL", (sal * 5) / 100);
        } else if (5 < sal && sal < 10) {
            System.out.printf("Tax paid: %.2fL", (sal * 20) / 100);
        } else if (10 < sal) {
            System.out.printf("Tax paid : %.2fL", (sal * 30) / 100);
        }
    }
}
