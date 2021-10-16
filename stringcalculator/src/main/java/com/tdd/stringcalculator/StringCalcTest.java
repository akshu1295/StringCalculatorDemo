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

}
