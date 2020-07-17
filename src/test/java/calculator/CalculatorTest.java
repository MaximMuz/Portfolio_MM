package test.java.calculator;

import ;
import org.junit.Before;
import org.junit.Test;
import calculator.Calculator;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void beforeTests() {
        calc = new Calculator();
    }

    @Test
    public void summTest() {
        int a = 45;
        int b = 76;
        int expResult = 121;
        int result = calc.summ(a, b);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void divideTest() {
        int a = 126;
        int b = 3;
        int expResult = 42;
        int result = calc.divide(a, b);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void multiTest() {
        int a = 45;
        int b = 20;
        int expResult = 900;
        int result = calc.multi(a, b);
        Assert.assertEquals(expResult, result);
    }

    @Test
    public void minusTest() {
        int a = 78;
        int b = 13;
        int expResult = 65;
        int result = calc.minus(a, b);
        Assert.assertEquals(expResult, result);
    }
}
