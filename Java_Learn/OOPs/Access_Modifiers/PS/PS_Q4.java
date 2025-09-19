//Recreating Q1 using Constructor overloading

package Java_Learn.OOPs.Access_Modifiers.PS;
import java.util.Scanner;
class cylin {
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

    public cylin(float rad, float hgt) {
        this.rad = rad;
        this.hgt = hgt;
    }

    public cylin(int length,int breadth){
        this.rad = length;
        this.hgt = breadth;
        System.out.println("Length: "+this.rad);
        System.out.println("Breadth: "+this.hgt);
    }
}
public class PS_Q4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float radius = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();

        cylin c1 = new cylin(radius,height);
        System.out.println();

        c1.getD();

        System.out.println();
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        cylin c2 = new cylin(length,breadth);


    }
}
