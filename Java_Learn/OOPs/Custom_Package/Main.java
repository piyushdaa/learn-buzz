/*
Exercise 5: Custom Geometry Package using Inheritance
Problem Statement: Create a custom Java package (suggested name: 'codewithharry') 
containing geometry classes. Use inheritance to properly manage the code. 
Implement methods in these classes to handle geometric calculations and properties.
Requirements:
1. Create a Custom Package [1].
2. Include the following classes, preferably inheriting from a base class like 'Shape' [1, 2]:
   - Rectangle
   - Square
   - Circle
   - Cylinder
   - Sphere
3. Implement necessary methods for each class, including Getters and Setters, 
   Volume calculation, and Surface Area calculation [1].
4. Consider using dimension variables (e.g., dim1, dim2) in the base class to manage 
   varying dimensions (length, breadth, radius, height) across different shapes [3].
*/
package Java_Learn.OOPs.Custom_Package;
import java.util.Scanner;
import Java_Learn.OOPs.Custom_Package.Shape.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape; 
        int choice;
        int choice2;
        OUTER: 
        // Main program loop
        while (true) {
            System.out.println("1. Area\n2.Volume\n3.Exit");
            choice = sc.nextInt();
            // Process user's main menu choice
            switch (choice) {
                case 1 -> {
                    System.out.println("1. Circle\n2. Square\n3. Rectangle\n4. Sphere\n5. Cylinder");
                    choice2 = sc.nextInt();
                    // Calculate area based on shape selection
                    switch (choice2) {
                        case 1 -> {
                            System.out.println("Enter radius: ");
                            shape = new Circle();
                            shape.setDim(sc.nextDouble());
                            System.out.printf("Area: %.2f\n",shape.Area());
                        }
                        case 2 -> {
                            System.out.println("Enter side: ");
                            shape = new Square();
                            shape.setDim(sc.nextDouble());
                            System.out.printf("Area: %.2f\n",shape.Area());
                        }
                        case 3 -> {
                            System.out.println("Enter length: ");
                            double length = sc.nextDouble();
                            System.err.println("Enter breadth: ");
                            double breadth = sc.nextDouble();
                            shape = new Rectangle();
                            shape.setDim(length, breadth);
                            System.out.printf("Area: %.2f\n",shape.Area());
                        }
                        case 4 -> {
                            System.err.println("Enter radius: ");
                            shape = new Sphere();
                            shape.setDim(sc.nextDouble());
                            System.out.printf("Area: %.2f\n",shape.Area());
                        }
                        case 5 -> {
                            System.out.println("Enter radius: ");
                            double radius = sc.nextDouble();
                            System.err.println("Enter height: ");
                            double height = sc.nextDouble();
                            shape = new Cylinder();
                            shape.setDim(radius,height);
                            System.out.printf("Area: %.2f\n",shape.Area());
                        }
                        default -> System.out.println("Wrong Choice");
                    }
                
                }
                case 2 -> {
                    System.out.println("1. Cylinder\n2. Sphere");
                    choice2 = sc.nextInt();
                    // Calculate volume based on shape selection
                    switch (choice2){
                        case 1 -> {
                            System.out.println("Enter radius: ");
                            double radius = sc.nextDouble();
                            System.out.println("Enter Height: ");
                            double height = sc.nextDouble();
                            shape = new Cylinder();
                            shape.setDim(radius, height);
                            System.out.printf("Volume: %.2f\n",shape.Vol());
                        }
                        case 2 -> {
                            System.out.println("Enter radius: ");
                            double radius = sc.nextDouble();
                            shape = new Sphere();
                            shape.setDim(radius);
                            System.out.printf("Volume: %.2f\n",shape.Vol());
                        }
                        default -> System.out.println("Wrong Choice...");
                    }
                }
                case 3 -> {
                    System.err.println("Exiting...");
                    // Exit the main loop
                    break OUTER;
                }
                default -> System.err.println("Wrong choice...");
            }
        }
    }
}
