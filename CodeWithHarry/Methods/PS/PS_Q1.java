//Printing Multiplication Table

package learn-buzz.CodeWithHarry.Methods.PS;
import java.util.Scanner;

public class PS_Q1 {
    static void multiplication(int number){
        for (int i = 1; i <= 10 ; i++){
            System.out.println(number+" X "+i+" = "+ number*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for multiplication table: ");
        multiplication(sc.nextInt());

    }
}
