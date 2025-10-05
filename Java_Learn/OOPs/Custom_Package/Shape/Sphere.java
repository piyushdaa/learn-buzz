// Package declaration for Shape classes
package Java_Learn.OOPs.Custom_Package.Shape;

/**
 * Sphere class extends Shape to represent a 3D sphere
 * This class demonstrates inheritance and method overriding for a 3D geometric shape
 */
public class Sphere extends Shape{
    /**
     * Default constructor for Sphere
     * Calls the parent Shape constructor with dimension value 0
     * The dimension represents the radius of the sphere
     */
    public Sphere(){
        super(0);
    }
    
    /**
     * Overrides the Area method from Shape class
     * Calculates and returns the surface area of a sphere using the formula: 4πr²
     * where r is the radius (Dim1)
     * @return The surface area of the sphere as a double value
     */
    @Override
    public double Area(){
        return 4.0*Math.PI*Math.pow(getDim1(), 2);
    }
    
    /**
     * Overrides the Vol method from Shape class
     * Calculates and returns the volume of a sphere using the formula: (4/3)πr³
     * where r is the radius (Dim1)
     * @return The volume of the sphere as a double value
     */
    @Override
    public double Vol(){
        return (4.0/3.0)*Math.PI*Math.pow(getDim1(), 3);
    }
}
