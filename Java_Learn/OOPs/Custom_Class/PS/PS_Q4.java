//Create a class rectangle with a method to initialize its side, area, perimeter etc

package Java_Learn.OOPs.Custom_Class.PS;
import java.util.Scanner;

//Creating class rectangle

class rectangle{
    float length;
    float breadth;
    public void side(){
        System.out.println("Length: "+length+" cms");
        System.out.println("Breadth: "+breadth+" cms");

    }
    public float area(){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length+breadth);
    }

}

//Main Class
public class PS_Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Creating object
        rectangle one = new rectangle();

        //Taking length,breadth and height as input

        System.out.print("Enter length: ");
        one.length = sc.nextFloat();
        System.out.print("Enter breadth: ");
        one.breadth = sc.nextFloat();


        //Printing Output
        System.out.println("-----------------------------");
        one.side();
        System.out.println("-----------------------------");
        System.out.printf("Area: %.2f\n",one.area());
        System.out.printf("Perimeter: %.2f\n",one.perimeter());


    }
}

