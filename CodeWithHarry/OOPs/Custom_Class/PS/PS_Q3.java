//Create a class square with a method to initialize its side, area, perimeter etc

package CodeWithHarry.OOPs.Custom_Class.PS;
import java.util.Scanner;

//Creating class square

class square{
    float side;
    public void side(){
        System.out.println("Side: "+side+" cms");
    }
    public float area(){
        return side*side;
    }
    public float perimeter(){
        return (4*side);
    }

}

//Main Class
public class PS_Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Creating object
        square one = new square();
        //Taking Side as input
        System.out.print("Enter side: ");
        one.side = sc.nextFloat();
        one.side();
        System.out.println("Area: "+one.area());
        System.out.println("Perimeter: "+one.perimeter());


    }
}
