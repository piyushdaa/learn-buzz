//Recreating Q1 using Constructor

package Java_Learn.OOPs.Access_Modifiers.PS;
import java.util.Scanner;
class cy{
    private float rad;
    private float hgt;

    //Getter
    public void getD(){
        System.out.println("Radius: "+rad);
        System.out.println("Height: "+hgt);
    }

    //Setter
    public void set(float rad,float hgt){
        this.rad = rad;
        this.hgt = hgt;
    }

    public cy(float rad, float hgt) {
        this.rad = rad;
        this.hgt = hgt;
    }
}
public class PS_Q3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        cylin c1 = new cylin(radius,height);
        System.out.println();

        c1.getD();


    }
}
