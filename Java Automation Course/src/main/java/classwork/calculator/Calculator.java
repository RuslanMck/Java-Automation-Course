package classwork.calculator;



public class Calculator {

    private int first;
    private int second;
    private char operator;

    public int calculate(String expression){
        InputHelper inputHelper = new InputHelper(expression);

        first = inputHelper.getFirstArgument();
        second = inputHelper.getSecondArgument();
        operator = inputHelper.getOperator();
        int result = 0;

        switch (operator){
            case ('+'):
                result = first + second;
                break;
            case ('-'):
                result = first - second;
                break;
            default:
                result = 0;
        }
        return result;
    }

}

