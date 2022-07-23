package com.amine.stringcalculatorkata;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StringCalculatorKataApplicationTests {

    @Test
    void testWithEmptyString() {
        assertEquals(0, Calculator.calculate(""));
    }

    @Test
    void testWith1NumberString() {
        assertEquals(1, Calculator.calculate("1"));
    }

    @Test
    void testWith2NumberString() {
        assertEquals(3, Calculator.calculate("1,2"));
    }

}
