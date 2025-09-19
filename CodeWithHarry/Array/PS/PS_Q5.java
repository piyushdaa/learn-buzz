//java program to reverse an array

package CodeWithHarry.Array.PS;
import java.util.Scanner;


public class PS_Q5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int[] array = new int[sc.nextInt()];
    for (int i = 0; i< array.length; i++){
        System.out.print("Enter number: ");
        array[i] = sc.nextInt();
    }
    for (int elements: array){
        System.out.print(elements+" ");
    }
    int length = array.length;
    int[] reverse = new int[array.length];
    for (int i = 0; i < array.length;i++ ){
        reverse[i] = array[length-1];
        length--;
    }
    System.out.print("\n");
    for (int re: reverse){
        System.out.print(re+" ");
    }
    }
}
