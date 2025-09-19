//WAP to greet the user with "Hello <user>, have a good day text".

package learn-buzz.CodeWithHarry.Inputs.PS;

import java.util.Scanner;

public class PS_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.printf("Hello %s, Have A Good Day!", name);


    }
}
