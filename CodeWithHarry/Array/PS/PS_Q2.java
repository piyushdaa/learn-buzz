//check whether a number is present in an array or not

package learn-buzz.CodeWithHarry.Array.PS;


import java.util.Scanner;

public class PS_Q2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        byte i = 0;
        while (i<arr.length){
            System.out.print("Enter number for array: ");
            arr[i] = sc.nextInt();
            i++;
        }

        System.out.print("Enter number to find: ");
        int num = sc.nextInt();
        int flag = 0;
        i = 0;
        while (i<arr.length){
            if (arr[i] == num){
                flag = 1;
                break;
            }
            i++;
        }
        if (flag == 1){
            System.out.printf("Found ya!\nAt index %d, right?",i+1);
        }
        else{
            System.out.print("Not Found!...I will try again!!");
        }



    }
}
