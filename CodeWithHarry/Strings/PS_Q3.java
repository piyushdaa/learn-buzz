//Replacing name

package learn-buzz.CodeWithHarry.Strings;

import java.util.Scanner;

public class PS_Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        String letter = "Dear <name>, Thanks a lot!";
        System.out.print(letter.replace("<name>", name));

    }
}
