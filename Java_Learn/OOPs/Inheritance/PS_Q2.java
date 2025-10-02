//Create a class rectangle and cuboid using inheritance and keep it close to real world as possible
//
package Java_Learn.OOPs.Inheritance;

import java.util.Scanner;

class rectangle {
    private final double length;
    private final double base;

    public rectangle(double length, double base) {
        this.length = length;
        this.base = base;

    }

    public double getRArea() {
        return this.length * this.base;
    }
}

class cuboid extends rectangle {
    private final double height;

    public cuboid(double length, double base, double height) {
        super(length, base);
        this.height = height;
    }

    public double getCVolume() {
        return getRArea() * this.height;
    }
}

public class PS_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double len, base, hgt;

        while (true){
            System.out.println("1. Area of rectangle\n2. Volume of Cuboid\n3. Exit");
            int choice = sc.nextInt();


            if (choice == 1){
                System.out.println("Enter length: ");
                len = sc.nextDouble();

                System.out.println("Enter Base: ");
                base = sc.nextDouble();

                rectangle cub1 = new rectangle(len, base);
                System.out.printf("Area of Rectangle: %.2f\n",cub1.getRArea());
            }

            else if (choice == 2) {

                System.out.println("Enter length: ");
                len = sc.nextDouble();

                System.out.println("Enter Base: ");
                base = sc.nextDouble();

                System.out.println("Enter height: ");
                hgt = sc.nextDouble();

                cuboid cub1 = new cuboid(len, base, hgt);
                System.out.printf("Volume of Cuboid: %.2f\n",cub1.getCVolume());
            }

            else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}
