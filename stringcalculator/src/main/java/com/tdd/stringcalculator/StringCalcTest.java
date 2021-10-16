package com.tdd.stringcalculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class StringCalcTest {
	@Test
    public void emptyStringShouldReturnZero() {
        StringCalcImpl sut = new StringCalcImpl();
        assertEquals(0, sut.calculate(""));
    }
	
	@Test
    public void oneNumberShouldReturnItself() {
        StringCalcImpl sut = new StringCalcImpl();
        assertEquals(3, sut.calculate("3"));
    }
	
	@Test
    public void twoNumbersShouldBeAdded() {
        StringCalcImpl sut = new StringCalcImpl();
        assertEquals(7, sut.calculate("2,5"));
    }
	
	@Test
    public void moreDigitsSupported() {
        StringCalcImpl sut = new StringCalcImpl();
        assertEquals(77, sut.calculate("22,55"));
    }
	
	@Test
	public void allowNnumersAsInput() {
        StringCalcImpl sut = new StringCalcImpl();
        assertEquals(45, sut.calculate("1,2,3,4,5,6,7,8,9"));
    }
	
	@Test
	public void supportNewLineAsSeparator() {
        StringCalcImpl sut = new StringCalcImpl();
        assertEquals(6, sut.calculate("1\n2,3"));
    }
	
	@Test
    public void supportForCustomDelimiter() {
        StringCalcImpl sut = new StringCalcImpl();
        assertEquals(10, sut.calculate(";\n1;2;3;4"));
    }
	
	@Test
    public void negativeNotSupported() {
        StringCalcImpl sut = new StringCalcImpl();
        try {
            sut.calculate("-1");
            fail("exception should have been thrown");
        }
        catch (IllegalArgumentException e) {
            assertEquals("negatives not allowed -1", e.getMessage());
        }
    }

}
