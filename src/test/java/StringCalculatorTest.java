import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    StringCalculator calculator;
    @BeforeEach
    void setUp(){
        calculator = new StringCalculator();
    }
    @Test
    void shouldBeZeroForEmptyString() throws NegativeNumberException {
        int value=calculator.add("");
        assertEquals(0,value);
    }

    @Test
    void shouldBeSameValueForSingleValueInString() throws NegativeNumberException {
        int value=calculator.add("1");
        assertEquals(1,value);
    }

    @Test
    void shouldAddTwoValuesInString() throws NegativeNumberException {
        int value=calculator.add("1,2");
        assertEquals(3,value);
    }

    @Test
    void shouldAddUnknownAmountOfInput() throws NegativeNumberException {
        int value=calculator.add("1,2,3,4");
        assertEquals(10,value);
    }

    @Test
    void shouldSupportNewLineDelimiter() throws NegativeNumberException {
        int value=calculator.add("1\n2,3,4");
        assertEquals(10,value);
    }

    @Test
    void shouldAddWhenMultipleDelimitersInInput() throws NegativeNumberException {
        int value=calculator.add("2\n1;2");
        assertEquals(5,value);
    }

    @Test
    void shouldThrowExceptionForNegativeValues() throws NegativeNumberException {
        assertThrows(NegativeNumberException.class,()->calculator.add("2\n-1;2"));
    }

    @Test
    void shouldIgnoreNumbersBiggerThan1000() throws NegativeNumberException {
        int value=calculator.add("2\n1002;2");
        assertEquals(4,value);
    }
}
