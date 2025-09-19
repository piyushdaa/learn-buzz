//average using method

package Java_Learn.Methods.PS;
import java.util.Scanner;

public class PS_Q6 {
    static float average(int[] num, int rng){
        int sum = 0;
        for ( int i: num){
            sum += i;
        }
        return (float) (sum/rng);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = sc.nextInt();
        int[] numbers = new int[range];
        for (int i = 0; i < range ; i++){
            System.out.printf("Enter number %d: ",i+1);
            numbers[i] = sc.nextInt();
        }
        System.out.printf("Sum: %.2f",average(numbers,range));
    }
}
