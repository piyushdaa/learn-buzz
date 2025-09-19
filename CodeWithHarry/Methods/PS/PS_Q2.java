//printing pattern
/*.
  ..
  ...
  ....
 */

package CodeWithHarry.Methods.PS;
import java.util.Scanner;
public class PS_Q2 {
    static void pattern(String a){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(a);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       System.out.print("Enter a symbol for pattern: ");
       Scanner sc = new Scanner(System.in);
       pattern(sc.next());
    }
}
