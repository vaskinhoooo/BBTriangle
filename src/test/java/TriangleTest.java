import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testEquilateralTriangle() {
        Triangle triangle = new Triangle(3, 3, 3);
        assertEquals("equilateral", triangle.classify());
    }

    @Test
    public void testIsoscelesTriangle() {
        Triangle triangle = new Triangle(3, 4, 3);
        assertEquals("isosceles", triangle.classify());
    }

    @Test
    public void testRightAngledTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals("right-angled", triangle.classify());
    }

    @Test
    public void testScaleneTriangle() {
        Triangle triangle = new Triangle(2, 3, 4);
        assertEquals("scalene", triangle.classify());
    }

    @Test
    public void testImpossibleTriangle() {
        Triangle triangle = new Triangle(1, 1, 10);
        assertEquals("impossible", triangle.classify());
    }

    @Test
    public void testGetArea() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6.0, triangle.getArea(), 0.001);
    }

    // Add more test cases as needed...

}
