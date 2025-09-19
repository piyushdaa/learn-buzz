//Repeat 5 with while loop

package CodeWithHarry.Loops.PS;
import java.util.Scanner;

public class PS_Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number for factorial: ");
        int num = sc.nextInt();

        int i = num;
        int fac = 1;
        while(i>0){
            fac = fac*i;
            i--;
        }

        System.out.printf("Factorial of %d is %d",num,fac);


    }
}
