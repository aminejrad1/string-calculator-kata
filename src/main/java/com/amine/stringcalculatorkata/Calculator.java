package com.amine.stringcalculatorkata;

public class Calculator {
    public static int calculate(String s) {
        if(s.isEmpty())
            return 0;

        return Integer.parseInt(s);
    }
}
