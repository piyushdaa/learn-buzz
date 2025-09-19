//printing pattern
// ....
// ...
// ..
// .
package learn-buzz.CodeWithHarry.Methods.PS;
import java.util.Scanner;

public class PS_Q4 {

    static void pattern(int range, String a){
        for (int i = 0; i < range; i++){
            for ( int j = range; j >i ; j--){
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        System.out.println("Enter symbol for printing: ");
        pattern(sc.nextInt(),sc.next());
    }
}
