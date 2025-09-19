//max number in array

package Java_Learn.Array.PS;
import java.util.Scanner;

public class PS_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++){
            System.out.print("Enter number: ");
            array[i] = sc.nextInt();
        }
        for (int all:array){
            System.out.print(all+" ");
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] >max ){
                max = array[i];
            }
        }
        System.out.print("\nMax: "+max);
    }
}
