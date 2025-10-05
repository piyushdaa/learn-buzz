package Java_Learn.OOPs.Custom_Package.Shape;


public class Square extends Shape{

    public Square(){
        super(0);
    }
    @Override
    public double Area(){
        return getDim1()*getDim1();
    }
    @Override
    public double Vol(){
        return 0;
    }

}
