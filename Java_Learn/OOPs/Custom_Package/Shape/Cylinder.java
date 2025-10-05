// Package declaration for Shape classes
package Java_Learn.OOPs.Custom_Package.Shape;

/**
 * Cylinder class extends Shape to represent a 3D cylinder
 * This class demonstrates inheritance and method overriding for a 3D geometric shape
 */
public class Cylinder extends Shape {
    /**
     * Default constructor for Cylinder
     * Calls the parent Shape constructor with two dimension values (radius and height)
     * Dim1 represents the radius, Dim2 represents the height
     */
    public Cylinder() {
        super(0, 0);
    }
    
    /**
     * Overrides the Area method from Shape class
     * Calculates and returns the surface area of a cylinder using the formula: 2πr(r + h)
     * where r is the radius (Dim1) and h is the height (Dim2)
     * @return The surface area of the cylinder as a double value
     */
    @Override
    public double Area() {
        return (2.0 * Math.PI * getDim1()) * (getDim1() + getDim2());
    }
    
    /**
     * Overrides the Vol method from Shape class
     * Calculates and returns the volume of a cylinder using the formula: πr²h
     * where r is the radius (Dim1) and h is the height (Dim2)
     * @return The volume of the cylinder as a double value
     */
    @Override
    public double Vol() {
        return Math.PI * Math.pow(getDim1(), 2) * getDim2();
    }
}
