package main.java.homework04;

public class Calculator {

    public static long add(long... values) {
        long sum = 0;
        for (long i : values) {
            sum += i;
        }
        return sum;
    }

    public static double add(double... values) {
        double sum = 0;
        for (double i : values) {
            sum += i;
        }
        return sum;
    }

    public static long subtract(long ... values){
        long result = 0;
        for (long i : values){
            result -= i;
        }
        return  result;
    }

    public static double subtract(double ... values){
        double result = 0;
        for (double i : values){
            result -= i;
        }
        return  result;
    }

    public static long multiply(long... values) {
        long result = 1;
        for (long i : values) {
            result *= i;
        }
        return result;
    }

    public static double multiply(double... values) {
        double result = 1;
        for (double i : values) {
            result *= i;
        }
        return result;
    }

    public static long divide(long... values) {
        long result = 0;
        if (CheckForZero.zeroCheck(values)) {
            for (int i = 0; i < values.length; i++) {
                if (result == 0){
                    result = values[i];
                    continue;
                }
                result /= values[i];
            }
        } else {
            System.out.println("Division cannot be performed. Values <= 0 are entered.");
            result = 0;
        }
        return result;
    }
    public static double divide(double... values) {
        double result = 0;
        if (CheckForZero.zeroCheck(values)) {
            for (int i = 0; i < values.length; i++) {
                if (result == 0){
                    result = values[i];
                    continue;
                }
                result /= values[i];
            }
        } else {
            System.out.println("Division cannot be performed. Values <= 0 are entered.");
            result = 0;
        }
        return result;
    }


}


