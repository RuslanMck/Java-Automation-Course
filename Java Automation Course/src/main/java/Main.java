package main.java;

import main.java.classwork01.Classwork01;
import main.java.homework01.ArraySorting;
import main.java.testFromLaptop.TestFromLaptop;
import main.java.testFromPc.TestFromPc;


public class Main {
    public static void main(String[] args) {

        int[] initialArray = {4, -2, 6, 7, -45, 21, -55, -21, 3,5,0,7,2,4,10,52,4,23,14,7,19,24,20,85};
//        ArraySorting.sortArray(initialArray);
//        Classwork01.SumOfFirstTenNaturalNumbers(initialArray);
//        Classwork01.SumOfArray(initialArray);
//        Classwork01.MaxMinValue(initialArray);
//        Classwork01.ArraySorting(initialArray);
//        Classwork01.PrintOnlyPositiveNumber(initialArray);
        Classwork01.PrintTillZero(initialArray);
    }
}