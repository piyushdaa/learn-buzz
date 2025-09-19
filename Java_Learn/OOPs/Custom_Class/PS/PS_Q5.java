//Create a class circle with a method to initialize its radius, area, perimeter etc

package Java_Learn.OOPs.Custom_Class.PS;
import java.util.Scanner;

//Creating class square

class circle{
    float radius;
    public void side(){
        System.out.println("Side: "+radius+" cms");
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return (2*3.14*radius);
    }

}

//Main Class
public class PS_Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Creating object
         circle one = new circle();
        //Taking Side as input
        System.out.print("Enter radius: ");
        one.radius = sc.nextFloat();
        //Printing output
        System.out.println("---------------------------------");
        one.side();
        System.out.println("----------------------------------");
        System.out.printf("Area: %.2f\n",one.area());
        System.out.println("Perimeter: "+one.perimeter());


    }
}
