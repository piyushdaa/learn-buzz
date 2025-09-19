//Celsius to fahrenheit

package learn-buzz.CodeWithHarry.Methods.PS;
import java.util.Scanner;

public class PS_Q10 {
    static float temp(float num){
        return ((num*9)/5)+32;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in C: ");
        System.out.printf("Temperature: %.2f F",temp(sc.nextFloat()));
    }
}
