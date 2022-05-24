import Calc_OOP.CalcOOP;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalcTests {

    @Test
    public void testCheckingTheSubtractionMethod(){
        CalcOOP myCalc = new CalcOOP(15,5);
        assertEquals(10,myCalc.minus(), 0);
    }

    @Test
    public void testCheckingTheAdditionMethod(){
        CalcOOP myCalc = new CalcOOP(15,5);
        assertEquals(20,myCalc.plus(), 0);
    }

    @Test
    public void testCheckingTheMultiplicationMethod(){
        CalcOOP myCalc = new CalcOOP(4,5);
        assertEquals(20,myCalc.multiplication(), 0);
    }

    @Test
    public void testCheckingTheDivisionMethod(){
        CalcOOP myCalc = new CalcOOP(10,5);
        assertEquals(2,myCalc.division(), 0);
    }

    @Test
    public void testCheckingTheDivisionByZeroMethod() {
        try {CalcOOP myCalc = new CalcOOP(10, 0);}
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
        public void testFirstNumberFormatException(){
        exception.expect(NumberFormatException.class);
        CalcOOP myCalc = new CalcOOP(1,1);
        myCalc.setFirstNumber(Double.parseDouble("a"));
            fail("Expected NumberFormatException");}

    @Test
    public void testSecondNumberFormatException(){
        exception.expect(NumberFormatException.class);
        CalcOOP myCalc = new CalcOOP(1,1);
        myCalc.setSecondNumber(Double.parseDouble("a"));
        fail("Expected NumberFormatException");}


    @Test(expected = AssertionError.class)
public void testAssertionError(){
        Scanner actual = new Scanner("10 5 a");
        fail("Expected AssertionError");
    }
}

