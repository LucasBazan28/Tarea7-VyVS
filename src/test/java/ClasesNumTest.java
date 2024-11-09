import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClasesNumTest {
    private ClasesNum clasesNum = new ClasesNum();

    @Test
    public void classifyNumberWithPositiveValueTest() {
        String result = clasesNum.classifyNumber(5);
        assertEquals("Positivo", result);
    }

    @Test
    public void classifyNumberWithNegativeValueTest() {
        String result = clasesNum.classifyNumber(-3);
        assertEquals("Negativo", result);
    }

    @Test
    public void classifyNumberWithZeroTest() {
        String result = clasesNum.classifyNumber(0);
        assertEquals("Cero", result);
    }

    @Test
    public void isEvenWithEvenTest(){
        boolean result = clasesNum.isEven(2);
        assertEquals(true, result);
    }

    @Test
    public void isEvenWithOddTest(){
        boolean result = clasesNum.isEven(3);
        assertEquals(false, result);
    }

    @Test
    public void isEvenWithEvenFalseTest(){
        boolean result = clasesNum.isEven(3);
        assertFalse(result);
    }

    @Test
    public void isIntegerWithWholeNumberTest() {
        boolean result = clasesNum.isInteger(10.0);
        assertTrue(result);
    }

    @Test
    public void isIntegerWithFractionalNumberTest() {
        boolean result = clasesNum.isInteger(10.5);
        assertFalse(result);
    }

    @Test
    public void isIntegerWithNegativeWholeNumberTest() {
        boolean result = clasesNum.isInteger(-3.0);
        assertTrue(result);
    }

    @Test
    public void isIntegerWithNegativeFractionalNumberTest() {
        boolean result = clasesNum.isInteger(-3.7);
        assertFalse(result);
    }
}
