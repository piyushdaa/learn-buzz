package Java_Learn.OOPs.Custom_Package.Shape;



public class Circle extends Shape{

    public Circle(){
        super(0);
    }
   
    @Override
    public double Area(){
        return Math.PI*Math.pow(getDim1(), 2);
    }
    @Override
    public double Vol(){
        return 0;
    }
}