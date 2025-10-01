//create a circle and use inheritance to create cylinder class

package Java_Learn.OOPs.Inheritance;

import java.util.Scanner;

//Circle class -> parent class
class circle {
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*this.radius*this.radius;
    }
}

//Cylinder Class -> child class
class cylinder extends circle {
    private double height;

    public cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double volume() {
        return getArea()*this.height;
    }
}
public class PS_Q1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Menu Driven
        while (true){
            int choice;
            System.out.println("1.Area of Circle\n2. Volume of Cylinder\n3. Exit");
            choice = sc.nextInt();
            if (choice == 1){
                double rad;
                System.out.println("Enter radius: ");
                rad = sc.nextDouble();
                circle c1 = new circle(rad);
                System.out.printf("Area: %.2f\n",c1.getArea());
            }

            else if (choice == 2){
                double rad,hgt;
                System.out.println("Enter radius: ");
                rad = sc.nextDouble();
                System.out.println("Enter height: ");
                hgt = sc.nextDouble();
                cylinder c1 = new cylinder(rad,hgt);
                System.out.printf("Volume: %.2f\n",c1.volume());
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else{
                System.out.println("Invalid Choice...");
            }
        }

    }
}
