//Create an abstract class Pen and abstract method write and refill

package Java_Learn.OOPs.Abstract_Class_and_Interface;


abstract class pen{
    abstract void write(String word);

    abstract void refill();
}
class FountainPen extends pen{
    void write(String word){
        System.out.println(word);
    }
    void refill(){
        System.out.println("Refilled...");
    }
    void changeNib(String nib){
        System.out.println("Nib change to "+nib);
    }
}
public class PS_Q1 {
}
