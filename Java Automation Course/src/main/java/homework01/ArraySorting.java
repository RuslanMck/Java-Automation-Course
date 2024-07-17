package main.java.homework01;

import java.util.Scanner;

public class ArraySorting {

    Scanner scanner = new Scanner(System.in);

    public int[] arrayFromConsole() {

        System.out.print("Pleas enter array size:");

        int input = scanner.nextInt();

        int[] consoleInput = new int[input];

        for (int i = 0; i < consoleInput.length; i++){
            System.out.print("Pleas enter a value for " + i + " position:");
            consoleInput[i] = scanner.nextInt();
        }

        return consoleInput;
    }

    public void sortArray(int[] array){

        int positiveValues = 0;
        int counter = 0;
        for (int a = 0; a < array.length; a++){
            if (array[a] > 0) {
                positiveValues++;
            }
        }

        int[] result = new int[positiveValues];

        for (int i : array) {
            if (i > 0) {
                result[counter] = i;
                counter++;
            }
        }

        for (int a : result){
            System.out.print(a + " ");
        }
    }
}
