import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MathUtilsTest {

    @Test
    public void testFactorial() {
        assertEquals(MathUtils.factorial(0), 1);
        assertEquals(MathUtils.factorial(5), 120);
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-1));
    }

    @Test
    public void testTriangleArea() {
        assertEquals(MathUtils.triangleArea(3, 4, 5), 6.0, 0.0001);
        assertThrows(IllegalArgumentException.class, () -> MathUtils.triangleArea(1, 2, 10));
    }

    @Test
    public void testAdd() {
        assertEquals(MathUtils.add(2, 3), 5);
        assertEquals(MathUtils.add(-1, 1), 0);
    }

    @Test
    public void testSubtract() {
        assertEquals(MathUtils.subtract(5, 3), 2);
        assertEquals(MathUtils.subtract(2, 3), -1);
    }

    @Test
    public void testMultiply() {
        assertEquals(MathUtils.multiply(2, 3), 6);
        assertEquals(MathUtils.multiply(0, 5), 0);
    }

    @Test
    public void testDivide() {
        assertEquals(MathUtils.divide(6, 3), 2.0, 0.0001);
        assertThrows(ArithmeticException.class, () -> MathUtils.divide(1, 0));
    }

    @Test
    public void testCompare() {
        assertTrue(MathUtils.compare(5, 3) > 0);
        assertTrue(MathUtils.compare(3, 5) < 0);
        assertEquals(MathUtils.compare(5, 5), 0);
    }
}