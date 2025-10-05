// Package declaration for Shape classes
package Java_Learn.OOPs.Custom_Package.Shape;

/**
 * Square class extends Shape to represent a 2D square
 * This class demonstrates inheritance and method overriding for a 2D geometric shape
 * A square is a special case of a rectangle where all sides are equal
 */
public class Square extends Shape{
    /**
     * Default constructor for Square
     * Calls the parent Shape constructor with dimension value 0
     * The dimension represents the side length of the square
     */
    public Square(){
        super(0);
    }
    
    /**
     * Overrides the Area method from Shape class
     * Calculates and returns the area of a square using the formula: side²
     * where side is the length of one side (Dim1)
     * @return The area of the square as a double value
     */
    @Override
    public double Area(){
        return getDim1()*getDim1();
    }
    
    /**
     * Overrides the Vol method from Shape class
     * Returns 0 as a square is a 2D shape and has no volume
     * @return 0 indicating no volume for a 2D shape
     */
    @Override
    public double Vol(){
        return 0;
    }
}
