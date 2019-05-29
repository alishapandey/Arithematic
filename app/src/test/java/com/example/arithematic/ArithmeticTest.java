package com.example.arithematic;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArithmeticTest {

        @Test
        public void testAddition()
        {
            Arithmetic arithmetic= new Arithmetic();
            float expectedResult =20;
            float actualResult =arithmetic.add(8,12);
            assertEquals(expectedResult,actualResult);
        }

        @Test
    public void testSubtract()
        {
            Arithmetic arithmetic = new Arithmetic();
            float expectedResult= 20;
            float actualResult = arithmetic.subtract(10,10);
            assertEquals(expectedResult,actualResult);
        }
}

