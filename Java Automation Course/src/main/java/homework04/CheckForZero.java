package main.java.homework04;

public class CheckForZero {
    public static boolean zeroCheck(long[] array){
        boolean result = false;
        for(long i : array){
           result = i > 0;
           if (!result){
               break;
           }
        }
        return result;
    }

    public static boolean zeroCheck(double[] array){
        boolean result = false;
        for(double i : array){
            result = i > 0;
            if (!result){
                break;
            }
        }
        return result;
    }
}
