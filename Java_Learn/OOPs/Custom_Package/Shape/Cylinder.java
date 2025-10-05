package Java_Learn.OOPs.Custom_Package.Shape;


public class Cylinder extends Shape {

    public Cylinder() {
        super(0, 0);
    }

    @Override
    public double Area() {
        return (2.0 * Math.PI * getDim1()) * (getDim1() + getDim2());
    }

    @Override
    public double Vol() {
        return Math.PI * Math.pow(getDim1(), 2) * getDim2();
    }
}
