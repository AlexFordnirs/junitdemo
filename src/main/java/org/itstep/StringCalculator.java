package org.itstep;

public class StringCalculator {
    public static int add(String s) {
        if(s == null || "".equals(s)) {
            return 0;
        }
        String[] snums = s.split(",");
        int sum = 0;
        for (String snum: snums) {
            sum += Integer.parseInt(snum.trim());
        }
        return sum;
    }
}
