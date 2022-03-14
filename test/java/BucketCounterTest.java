import org.junit.Test;

import static org.junit.Assert.*;

public class BucketCounterTest {

    @Test
    public void getBucketCount() {
//        fail("This test hasn't been implemented yet");
        assertEquals(3, BucketCounter.getBucketCount(3.4, 2.1, 1.5, 2));
    }

    @Test
    public void testGetBucketCount() {
//        fail("This test hasn't been implemented yet");
        assertEquals(5, BucketCounter.getBucketCount(3.4, 2.1, 1.5));
    }

    @Test
    public void testGetBucketCount1() {
//        fail("This test hasn't been implemented yet");
        assertEquals(3, BucketCounter.getBucketCount(3.4, 1.5));
    }
}