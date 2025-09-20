//Finding Entered year is leap year o not

package Java_Learn.Conditions.PS;
//importing Scanner Class
import java.util.Scanner;

public class PS_Q5 {
    public static void main(String[] args){

        //Creating Scanner object
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        //Printing Output
        if (year%4 == 0 && year%100 != 0){
            System.out.printf("%d is Leap Year.",year);
        }else {
            System.out.printf("%d is not Leap Year.",year);
        }
    }
}
