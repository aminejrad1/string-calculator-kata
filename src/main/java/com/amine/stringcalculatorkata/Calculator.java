package com.amine.stringcalculatorkata;

public class Calculator {
    public static int calculate(String s)
    {
        if(s.isEmpty())
            return 0;

        if(s.length()==1)
            return Integer.parseInt(s);

        int total = 0;
        String[] stringArray = s.split(",");

        for (String value : stringArray) {
            total += Integer.parseInt(value);
        }

      return total;
    }
}
