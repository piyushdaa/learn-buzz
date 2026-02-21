package Java_Learn.File_Handling;

import java.util.Scanner;

public class Scanner_Bug {
    static void main() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter age and full name: ");
        int age = Integer.parseInt(input.nextLine());
        String name = input.nextLine();
        System.out.println(age);
        System.out.println(name);

    }
}
