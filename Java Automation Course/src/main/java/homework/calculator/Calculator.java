package homework.calculator;

import java.awt.*;

public class Calculator {


    private InputHelper inputHelper = new InputHelper();

    public void Calculate(String expression){

        int sum = 0;
        int[] arguments = inputHelper.getArguments(expression);
        for (int i : arguments){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
