import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.*;

public class CalculateTipTest {

    CalculateTip ct;
    BigDecimal bd;

    @Before
    public void setUp() throws Exception {
        ct = new CalculateTip();
    }

    @Test
    public void totalWithTipTest() {
        assertEquals(BigDecimal.valueOf(118.00).setScale(2, RoundingMode.HALF_UP), ct.totalWithTip(100.00));
    }

    @Test
    public void totalWithTipNegativeCostTest() {
        assertEquals(BigDecimal.valueOf(0), ct.totalWithTip(-10));
    }

    @Test
    public void tip18PercentTest() {
        assertEquals(BigDecimal.valueOf(18).setScale(2, RoundingMode.HALF_UP), ct.tip18Percent(100));
    }

    @Test
    public void tip18PercentNegativeCostTest() {
        assertEquals(BigDecimal.valueOf(0), ct.tip18Percent(-100));
    }

    @Test
    public void calculateTipAmountTest() {
        assertEquals(BigDecimal.valueOf(18).setScale(2, RoundingMode.HALF_UP), ct.calculateTipAmount(100.00, 18));
        assertEquals(BigDecimal.valueOf(1.08).setScale(2, RoundingMode.HALF_UP), ct.calculateTipAmount(9.00, 12));
    }

    @Test
    public void calculateTipNegativeTotalTest() {
        assertEquals(BigDecimal.valueOf(0), ct.calculateTipAmount(-100.00, 18));
    }

    @Test
    public void calculateTipNegativeTipTest() {
        assertEquals(BigDecimal.valueOf(0), ct.calculateTipAmount(100.00, -18));
    }
}