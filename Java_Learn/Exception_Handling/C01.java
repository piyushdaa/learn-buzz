package Java_Learn.Exception_Handling;
import java.util.Scanner;

public class C01 {

    void divide(int a, int b) {
        try {
            float c = (float)a / b;
            System.out.println((float)c);
        } catch (ArithmeticException exp) {
            if (exp.getMessage().equalsIgnoreCase("/ by zero")){
                System.out.println("Division by zero occurred.");
            }else{
                throw exp;
            }

        }


    }
    void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        divide(first,second);
    }
}
