//array sorted or not

package CodeWithHarry.Array.PS;
import java.util.Scanner;

public class PS_Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < (array.length)*2; i++) {
            if (i < array.length) {
                System.out.print("Enter number: ");
                array[i] = sc.nextInt();
            } else {
                System.out.print(array[i - array.length] + " ");
            }
        }
        boolean asc = true;
        boolean dsc = true;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] > array[i+1]){
                asc = false;
            }else if (array[i] < array[i+1]){
                dsc = false;
            }
        }
        if (asc){
            System.out.print("\nAscending order...");
        }else if (dsc){
            System.out.print("\nDescending Order...");

        }else{
            System.out.print("\nUnsorted...");
        }

    }
}