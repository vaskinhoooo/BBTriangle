import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import triangle.Triangle;

public class TriangleTest {

    @Test
    public void testEquilateralTriangle() {
        Triangle triangle = new Triangle(5, 5, 5);
        assertEquals("equilateral", triangle.classify());
    }

    @Test
    public void testIsoscelesTriangle() {
        Triangle triangle = new Triangle(5, 5, 6);
        assertEquals("isosceles", triangle.classify());
    }

    @Test
    public void testRightAngledTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals("right-angled", triangle.classify());
    }

    @Test
    public void testScaleneTriangle() {
        Triangle triangle = new Triangle(7, 8, 10);
        assertEquals("scalene", triangle.classify());
    }

    @Test
    public void testImpossibleTriangle() {
        Triangle triangle = new Triangle(0, 1, 2);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    public void testGetArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6.0, triangle.getArea());
    }

    @Test
    public void testGetPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(12, triangle.getPerimeter());
    }
    
    // Additional test cases can be added based on specific scenarios and edge cases.
}
