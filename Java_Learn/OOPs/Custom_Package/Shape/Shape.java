package Java_Learn.OOPs.Custom_Package.Shape;


public abstract class Shape {

    private double dim1;
    private double dim2;

    public Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public Shape(double dim1){
        this.dim1 = dim1;
    }

    public double getDim1() {
        return this.dim1;
    }

    public double getDim2() {
        return this.dim2;
    }

    public void setDim(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public void setDim(double dim1){
        this.dim1 = dim1;
    }

    public abstract double Area();
    public abstract double Vol();

}
