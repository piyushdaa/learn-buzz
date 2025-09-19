//Adding two numbers
package CodeWithHarry.Inputs;

import java.util.Scanner;

public class Code_01 {
    public static void main(String[] args) {
        System.out.print("Adding Two Numbers:\n");
        int num1, num2;
        Scanner code = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num1 = code.nextInt();
        System.out.println("Enter another number; ");
        num2 = code.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is : " + sum);

        //Checking for an integer
        System.out.println("Enter Only Number");
        boolean com = code.hasNextInt();
        System.out.println(com);

    }
}
