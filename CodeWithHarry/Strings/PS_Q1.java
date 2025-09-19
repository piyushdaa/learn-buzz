//Code to convert all into lowercase

package learn-buzz.CodeWithHarry.Strings;

import java.util.Scanner;

public class PS_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String var = sc.next();

        System.out.print(var.toLowerCase());
    }
}
