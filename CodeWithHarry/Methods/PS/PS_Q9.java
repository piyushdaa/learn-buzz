//Q3 without recursion

package CodeWithHarry.Methods.PS;
import java.util.Scanner;
public class PS_Q9 {
    static void sum(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.printf("Sum of %d natural numbers: %d",num,sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        sum(sc.nextInt());
    }
}
