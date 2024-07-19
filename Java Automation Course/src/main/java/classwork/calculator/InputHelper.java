package classwork.calculator;

public class InputHelper {

    private String expression;

    public InputHelper(String expression){
        this.expression = expression;
    }

    public int getFirstArgument(){
        return Integer.parseInt(expression.substring(0, 1));
    }

    public int getSecondArgument(){
        return Integer.parseInt(expression.substring(4));
    }

    public char getOperator(){
        return expression.charAt(2);
    }
}
