import org.junit.Test;

import static org.junit.Assert.*;

public class AreaCalculatorTest {

    @Test
    public void area() {
//        fail("Test has not been created");
        assertEquals(78.53975, AreaCalculator.area(5.0), 0.05);
    }

    @Test
    public void testArea() {
//        fail("Test has not been created");
        assertEquals(20.0, AreaCalculator.area(5.0, 4.0), 0);

    }
}