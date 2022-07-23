package com.amine.stringcalculatorkata;

public class Calculator {
    public static int calculate(String s)
    {
        if(s.isEmpty())
            return 0;

        if(s.length()==1)
            return Integer.parseInt(s);

        int total = 0;
        String[] stringArray = s.split("\n");

        for (String value : stringArray) {
            String[] array = value.split(",");
            for (String item : array) total += Integer.parseInt(item);
        }

      return total;
    }
}
