//Create a Hierarchy of Classes and Interfaces:
//    ◦ Create a class named Monkey with concrete methods: jump and bite.
//    ◦ Create an interface named BasicAnimal containing the abstract methods: eat and sleep.
//    ◦ Create a Human class that inherits the Monkey class and implements the BasicAnimal interface.
// Shows polymorphism
package Java_Learn.OOPs.Abstract_Class_and_Interface;

import java.util.Scanner;

class Monkey {
    void Jump() {
        System.out.println("Jumped...");
    }

    void Bite() {
        System.out.println("Bit....");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {

    public void eat() {
        System.out.println("Eats...");
    }

    public void sleep() {
        System.out.println("Sleeps...");
    }
}

public class PS_Q2 {
    public static void main(String[] args) {
        Monkey obj = new Human();
        Human person = new Human();

        System.out.print("Monkey ");
        obj.Bite();
        System.out.print("Monkey ");
        obj.Jump();
        System.out.print("Human ");
        person.sleep();
        System.out.print("Human ");
        person.eat();
        System.out.print("Human ");
        person.Bite();
        System.out.print("Human ");
        person.Jump();
    }
}
