//kms to miles

package Java_Learn.Inputs.PS;

import java.util.Scanner;

public class PS_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance(kms) : ");
        float distance = sc.nextFloat();
        double miles = distance / 1.60934;
        System.out.printf("Miles : %.2f", miles);
    }
}
