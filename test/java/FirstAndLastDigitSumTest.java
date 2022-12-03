import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDigitSumTest {

    FirstAndLastDigitSum firstAndLastDigitSum;

    @Before
    public void setup(){
        firstAndLastDigitSum = new FirstAndLastDigitSum();
    }

    @Test
    public void sumFirstAndLastDigitTest() {
        assertEquals(9, firstAndLastDigitSum.sumFirstAndLastDigit(257));
        assertEquals(2, firstAndLastDigitSum.sumFirstAndLastDigit(151));
    }

    @Test
    public void sumFirstAndLastDigitNegNumTest(){
        assertEquals(-1, firstAndLastDigitSum.sumFirstAndLastDigit(-22));
    }

    @Test
    public void getEvenDigitSumTest() {
        assertEquals(4, firstAndLastDigitSum.getEvenDigitSum(252));
        assertEquals(0, firstAndLastDigitSum.getEvenDigitSum(11111));
    }

    @Test
    public void getEvenDigitSumNegNumTest(){
        assertEquals(-1, firstAndLastDigitSum.getEvenDigitSum(-2));
    }
}