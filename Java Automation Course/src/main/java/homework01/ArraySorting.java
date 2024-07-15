package main.java.homework01;

public class ArraySorting {
    public static void sortArray(int[] array){

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
            System.out.print(a + ", ");
        }




    }
}
