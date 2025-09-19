//Finding distance

package CodeWithHarry.Operators;

import java.util.Scanner;

public class PS_Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter final speed: ");
        int v = sc.nextInt();

        System.out.print("Enter initial speed: ");
        int u = sc.nextInt();

        System.out.print("Enter acceleration: ");
        int a = sc.nextInt();

        int s = ((v * v) - (u * u)) / (2 * a);
        System.out.print("The distance is " + s);


    }
}
