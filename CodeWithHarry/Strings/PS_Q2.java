//Code to convert spaces with underscore

package CodeWithHarry.Strings;

import java.util.Scanner;

public class PS_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter strings: ");
        String str = sc.nextLine();

        System.out.println(str.replace(' ', '_'));

    }
}
