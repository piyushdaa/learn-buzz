//print nth term of fibonacci series

package learn-buzz.CodeWithHarry.Methods.PS;
import java.util.Scanner;
public class PS_Q5 {
    static int fibo(int num){
        int sum;
        if (num == 0 || num == 1){
            if (num == 0){
                return 0;
            }else{
                return 1;
            }
        }
        else{
             sum = fibo(num-1)+fibo(num-2);
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term: ");
        System.out.print(fibo(sc.nextInt()));
    }
}
