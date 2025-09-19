//Detecting double or triple spaces

package CodeWithHarry.Strings;

import java.util.Scanner;

public class PS_Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter line with double or triple spaces: ");
        String line = sc.nextLine();

        System.out.println(line.indexOf("  "));
        System.out.print(line.indexOf("   "));
    }
}
