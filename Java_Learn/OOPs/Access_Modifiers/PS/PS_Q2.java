//Calculate surface area and volume using 1st question

package Java_Learn.OOPs.Access_Modifiers.PS;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PS_Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Using class cylinder from Q1
        cylinder c1 = new cylinder();

        System.out.print("Enter radius: ");
        float rad = sc.nextFloat();
        System.out.print("Enter height: ");
        float hgt = sc.nextFloat();
        c1.set(rad,hgt);

        c1.get();
        System.out.println();
        System.out.printf("Surface Area: %.2f\n",cylinder.area(rad,hgt));
        System.out.printf("Volume: %.2f\n",cylinder.vol(rad,hgt));

        sc.close();
    }
}
