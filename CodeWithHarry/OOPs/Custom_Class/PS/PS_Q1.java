//Create a class Employee with following properties and methods:
//1. Salary (property) (int)
//2. getSalary(method returning int)
//3. name (property) (string)
//4. getName (method returning String)
//5. setName (method changing name)
package CodeWithHarry.OOPs.Custom_Class.PS;

import java.util.Scanner;

//Creating class
class Employee {

    int Salary;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getSalary() {
        return Salary;
    }
}

public class PS_Q1 {

    static void main(String[] args) {

        //Creating Object
        Employee emp = new Employee();

        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter Employee Name: ");
        emp.name = sc.next();

        System.out.print("Enter Employee Salary: ");
        emp.Salary = sc.nextInt();

        //Printing initial output
        System.out.println("Initial Employee Details");
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println();

        String choice = sc.next();
        if (choice.equals("Y") || choice.equals("y")) {
            System.out.print("Enter new name for the employee: ");
            emp.setName(sc.next());
            System.out.println();

            // Printing the output after changing the name
            System.out.println(" Updated Employee Details");
            System.out.println(emp.getName());
            System.out.println(emp.getSalary());
        } else {
            System.out.println("No Change Made...");
        }


    }
}