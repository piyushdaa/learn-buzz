// Package declaration for Shape classes
package Java_Learn.OOPs.Custom_Package.Shape;

/**
 * Abstract base class Shape that serves as a parent for all geometric shapes
 * This class demonstrates abstraction, encapsulation, and constructor overloading in Java
 * All shape classes (Circle, Rectangle, Cylinder, Sphere, Square) inherit from this class
 */
public abstract class Shape {
    // Private instance variables to store shape dimensions
    private double dim1; // First dimension (e.g., radius, length, side)
    private double dim2; // Second dimension (e.g., width, height)
    
    /**
     * Constructor with two dimensions
     * Used by shapes that require two measurements (e.g., Rectangle, Cylinder)
     * @param dim1 The first dimension of the shape
     * @param dim2 The second dimension of the shape
     */
    public Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    /**
     * Constructor with one dimension
     * Used by shapes that require only one measurement (e.g., Circle, Sphere, Square)
     * @param dim1 The primary dimension of the shape
     */
    public Shape(double dim1){
        this.dim1 = dim1;
    }
    
    /**
     * Getter method for the first dimension
     * @return The value of dim1
     */
    public double getDim1() {
        return this.dim1;
    }
    
    /**
     * Getter method for the second dimension
     * @return The value of dim2
     */
    public double getDim2() {
        return this.dim2;
    }
    
    /**
     * Setter method to update both dimensions
     * Method overloading - accepts two parameters
     * @param dim1 The new value for the first dimension
     * @param dim2 The new value for the second dimension
     */
    public void setDim(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    
    /**
     * Setter method to update the first dimension only
     * Method overloading - accepts one parameter
     * @param dim1 The new value for the first dimension
     */
    public void setDim(double dim1){
        this.dim1 = dim1;
    }
    
    /**
     * Abstract method to calculate the area of the shape
     * Must be implemented by all child classes
     * @return The calculated area as a double value
     */
    public abstract double Area();
    
    /**
     * Abstract method to calculate the volume of the shape
     * Must be implemented by all child classes
     * Returns 0 for 2D shapes (Circle, Rectangle, Square)
     * @return The calculated volume as a double value
     */
    public abstract double Vol();
}
