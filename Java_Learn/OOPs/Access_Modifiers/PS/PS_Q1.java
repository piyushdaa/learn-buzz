//Create a class cylinder and use setter and getters to set its radius and height

package Java_Learn.OOPs.Access_Modifiers.PS;
import java.util.Scanner;

//Creating Class Cylinder
class cylinder{
    private float radius;
    private float height;

    //Printing Details
    public void get() {
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);

    }
    //Setting Details
    public void set(float radius, float height){
        this.radius = radius;
        this.height = height;
    }

    //Surface Area
    public static double area(float radius, float height){
        return 2*3.14*radius*(radius+height);
    }

    //Volume
    public static double vol(float radius, float height){
        return 3.14*radius*radius*height;
    }

}
public class PS_Q1 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.println("-----Cylinder-------------");
        System.out.println("Enter radius: ");
        System.out.println("Enter height: ");
        c1.set(sc.nextFloat(),sc.nextFloat());
        System.out.println("-------------------------");
        c1.get();
    }
}
