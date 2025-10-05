package Java_Learn.OOPs.Custom_Package.Shape;


public class Rectangle extends Shape {

    public Rectangle() {
        super(0, 0);
    }

    @Override
    public double Vol() {
        return 0;
    }

    @Override
    public double Area() {
        return getDim1() * getDim2();
    }


}
