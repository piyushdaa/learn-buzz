//Q2 using for loop

package Java_Learn.Loops.PS;

import java.util.Scanner;

public class PS_Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        int even = 0;
        int count = 0;

        for (int i = 0; count <=terms; i++){
            if (i%2==0){
                even += i;
                count++;
            }
        }
        System.out.printf("The sum of %d even numbers is %d", terms, even);
    }
}
