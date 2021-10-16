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

}
