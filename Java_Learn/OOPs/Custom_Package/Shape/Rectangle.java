// Package declaration for Shape classes
package Java_Learn.OOPs.Custom_Package.Shape;

/**
 * Rectangle class extends Shape to represent a 2D rectangle
 * This class demonstrates inheritance and method overriding for a 2D geometric shape
 */
public class Rectangle extends Shape {
    /**
     * Default constructor for Rectangle
     * Calls the parent Shape constructor with two dimension values
     * Dim1 represents the length, Dim2 represents the width
     */
    public Rectangle() {
        super(0, 0);
    }
    
    /**
     * Overrides the Vol method from Shape class
     * Returns 0 as a rectangle is a 2D shape and has no volume
     * @return 0 indicating no volume for a 2D shape
     */
    @Override
    public double Vol() {
        return 0;
    }
    
    /**
     * Overrides the Area method from Shape class
     * Calculates and returns the area of a rectangle using the formula: length × width
     * where length is Dim1 and width is Dim2
     * @return The area of the rectangle as a double value
     */
    @Override
    public double Area() {
        return getDim1() * getDim2();
    }
}
