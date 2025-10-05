// Package declaration for Shape classes
package Java_Learn.OOPs.Custom_Package.Shape;

/**
 * Circle class extends Shape to represent a 2D circle
 * This class demonstrates inheritance and method overriding in Java
 */
public class Circle extends Shape{
    /**
     * Default constructor for Circle
     * Calls the parent Shape constructor with dimension value 0
     * The dimension will represent the radius of the circle
     */
    public Circle(){
        super(0);
    }
   
    /**
     * Overrides the Area method from Shape class
     * Calculates and returns the area of a circle using the formula: π * r²
     * @return The area of the circle as a double value
     */
    @Override
    public double Area(){
        return Math.PI*Math.pow(getDim1(), 2);
    }
    
    /**
     * Overrides the Vol method from Shape class
     * Returns 0 as a circle is a 2D shape and has no volume
     * @return 0 indicating no volume for a 2D shape
     */
    @Override
    public double Vol(){
        return 0;
    }
}
