//Sum of numbers occuring in table of 8

package Java_Learn.Loops.PS;
import java.util.Scanner;

public class PS_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        byte terms = sc.nextByte();

        int sum = 0;


        for (int i = 1; i <= terms; i++){
            sum += (8*i);
        }
        System.out.printf("Sum of %d terms of 8's table is %d",terms,sum);
    }
}
