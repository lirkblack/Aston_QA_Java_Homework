import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    void testFactorial() {
        assertEquals(1, MathUtils.factorial(0));
        assertEquals(120, MathUtils.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-1));
    }

    @Test
    void testTriangleArea() {
        assertEquals(6.0, MathUtils.triangleArea(3, 4, 5), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> MathUtils.triangleArea(1, 2, 10));
    }

    @Test
    void testArithmetic() {
        assertEquals(5, MathUtils.add(2, 3));
        assertEquals(-1, MathUtils.subtract(2, 3));
        assertEquals(6, MathUtils.multiply(2, 3));
        assertEquals(2.0, MathUtils.divide(6, 3), 0.0001);
        assertThrows(ArithmeticException.class, () -> MathUtils.divide(1, 0));
    }

    @Test
    void testCompare() {
        assertTrue(MathUtils.compare(5, 3) > 0);
        assertTrue(MathUtils.compare(3, 5) < 0);
        assertEquals(0, MathUtils.compare(5, 5));
    }
}