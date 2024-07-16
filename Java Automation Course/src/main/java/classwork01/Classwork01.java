package main.java.classwork01;

import java.util.Arrays;

public class Classwork01 {
    public static void SumOfFirstTenNaturalNumbers(int[] array){
        int sum = 0;
        int positiveValues = 0;
        for (int j : array) {

            if (positiveValues < 10 && j > 0) {
                sum = sum + j;
                positiveValues++;
            }
        }
        System.out.println("Result = " + sum);
        System.out.println("Positive Values: " + positiveValues);
    }

    public static void SumOfArray(int[] array){
        int sum = 0;
        for (int i : array){
            sum = sum + i;
        }
        System.out.println("Sum of array: " + sum);
    }

    public static void MaxMinValue(int[] array){
        int maxValue = 0;
        int minValue = 0;
        for (int i : array){
            if (i > maxValue){
                maxValue = i;
            } else if (i < minValue) {
                minValue = i;
            }
        }
        System.out.println("Min Value: " + minValue);
        System.out.println("Max Value: " + maxValue);
    }

    public static void ArraySorting(int[] initialArray){

        for (int i = 0; i < initialArray.length; i++){
            for (int j = i+1; j < initialArray.length; j++){

                if (initialArray[i] > initialArray[j]){
                    int temp = initialArray[i];
                    initialArray[i] = initialArray[j];
                    initialArray[j] = temp;
                }
            }
        }

        for (int i : initialArray)
            System.out.print(i + ", ");
    }

    public static void PrintOnlyPositiveNumber(int[] array){
        for(int i : array){
            if (i > 0){
                System.out.print(i + ", ");
            }
        }
    }

    public static void PrintTillZero(int[] array){
        for (int i : array){
            if (i != 0){
                System.out.print(i + ", ");

            } else break;
        }
    }
}
