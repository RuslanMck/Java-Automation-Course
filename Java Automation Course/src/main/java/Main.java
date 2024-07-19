package main.java;

import main.java.homework04.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.add(5,5,2,3));
        System.out.println(Calculator.add(5.1,8.4,0.5));
        System.out.println(Calculator.multiply(2,5,4));
        System.out.println(Calculator.multiply(2.5,8.1,0.2));
        System.out.println(Calculator.divide(20,5));
        System.out.println(Calculator.divide(22.4,5,24.6));
        System.out.println(Calculator.subtract(5,2,20));
    }
}