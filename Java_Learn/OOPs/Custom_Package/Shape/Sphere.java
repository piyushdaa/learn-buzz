package Java_Learn.OOPs.Custom_Package.Shape;




public class Sphere extends Shape{

    public Sphere(){
        super(0);
    }

    @Override
    public double Area(){
        return 4.0*Math.PI*Math.pow(getDim1(), 2);
    }
    @Override
    public double Vol(){
        return (4.0/3.0)*Math.PI*Math.pow(getDim1(), 3);
    }
}