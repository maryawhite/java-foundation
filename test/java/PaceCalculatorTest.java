import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaceCalculatorTest {

    @Test
    public void minToSec() {
//        fail("This test hasn't been implemented yet");
        ////        System.out.println(minToSec(8));   //8:00 = 480 seconds
        //        assertEquals(78.53975, AreaCalculator.area(5.0), 0.05);
        assertEquals(480, PaceCalculator.minToSec(8));

    }

    @Test
    public void calculatePace() {
//        fail("This test hasn't been implemented yet");
        //// System.out.println(calculatePace(28, 32, 3.107F));  // 9:11
        assertEquals("your pace 9:11 per mile", PaceCalculator.calculatePace(28, 32, 3.107F));

    }
}