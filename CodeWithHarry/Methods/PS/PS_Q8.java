//Q2 using Recursion

package learn-buzz.CodeWithHarry.Methods.PS;
import java.util.Scanner;

public class PS_Q8 {
    static void pattern(String ch,int range){
        if (range == 0){
            return;
        }
        pattern(ch,range-1);
        for (int i = 0; i < range  ; i++){
            System.out.print(ch);

        }System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter symbol: ");
        System.out.println("Enter range: ");
        pattern(sc.next(),sc.nextInt());
    }
}
