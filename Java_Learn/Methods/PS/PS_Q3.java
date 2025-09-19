//sum of n natural numbers using recursion

package Java_Learn.Methods.PS;
import java.util.Scanner;

public class PS_Q3 {
    static int sum(int range){
        int sum;
        if (range == 1){
            return 1;
        }else{
            sum = range + sum(range - 1);
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        System.out.print(sum(sc.nextInt()));
    }
}
