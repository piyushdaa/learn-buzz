/*Shows abstract classes, inheritence and polymorphism
*/
package Java_Learn.OOPs.Abstract_Class_and_Interface;

import java.util.Scanner;

abstract class Telephone{
    abstract void ring();
   abstract void disconnect();
   abstract void lift();
}
class SmartTelephone extends Telephone{
    @Override
    void ring() {
        System.out.println("Ring...");
    }
    @Override
    void lift(){
        System.out.println("Lift...");
    }
    @Override
    void disconnect(){
        System.out.println("Disconnect...");
    }
    int autoconnect(int number){
        return number;
    }
}
public class PS_Q3 {
    public static void main(String[] args){
        Telephone tel = new SmartTelephone();
        SmartTelephone smrttel = new SmartTelephone();
        Scanner sc = new Scanner(System.in);

        tel.ring();
        tel.lift();
        tel.disconnect();

        System.out.print("Enter number to auto connect: ");
        System.out.printf("Connecting to %d", smrttel.autoconnect(sc.nextInt()));
    }
}
