//Q4 using Recursion

package Java_Learn.Methods.PS;
import java.util.Scanner;

public class PS_Q7 {
    static String pattern(String ch,int range){
        if (range == 1){
            return ch;
        }
        for (int i = 0; i < range; i++){
            System.out.print(ch);
        }System.out.println();
        return pattern(ch,range-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter symbol: ");
        System.out.println("Enter range: ");
        System.out.print(pattern(sc.next(),sc.nextInt()));
    }
}
