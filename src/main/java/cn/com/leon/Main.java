package cn.com.leon;

import java.text.NumberFormat;

/**
 * @author leon
 */
public class Main {

    public static void main(String[] args) {
        double a = 1.0;
        double b = 99999999999999.0;
        long c = 1;
        long d = 9L;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(10);
        String e = numberFormat.format((double) c / (double) d);
        System.out.println(e);
        System.out.println(c / d);

    }

}
