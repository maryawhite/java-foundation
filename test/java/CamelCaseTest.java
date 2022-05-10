import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaseTest {

    @Test
    public void toCamelCase() {
//        fail("Test has not been created");
//        assertTrue(CamelCase.toCamelCase("the-stealth-warrior").equals("theStealthWarrior"));
        assertEquals("theStealthWarrior", CamelCase.toCamelCase("the-stealth-warrior"));
        assertEquals("MaryHadA", CamelCase.toCamelCase("Mary-had-a"));
        assertEquals("AppleBananaCarrot", CamelCase.toCamelCase("Apple_banana_carrot"));
        assertEquals("", CamelCase.toCamelCase(""));

    }
}