package classwork.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHelper {

    private String expression;
    private Pattern pattern;
    private Matcher matcher;

    public InputHelper(String expression){
        this.expression = expression;

        pattern = Pattern.compile("^\\d+\\s*[+-]\\s*\\d+$");
        matcher = pattern.matcher(expression);

        if (!isStringCorrect()){
            throw new RuntimeException("Input is not correct");
        }
    }

    public int getFirstArgument(){
        pattern = Pattern.compile("^(\\d+)");
        matcher = pattern.matcher(expression);
        matcher.find();
        return Integer.parseInt(matcher.group());
    }

    public int getSecondArgument(){
        pattern = Pattern.compile("(\\d+)$");
        matcher = pattern.matcher(expression);
        matcher.find();
        return Integer.parseInt(matcher.group());
    }

    public char getOperator(){
        pattern = Pattern.compile("([+-])");
        matcher = pattern.matcher(expression);
        matcher.find();
        return matcher.group().charAt(0);
    }

    private boolean isStringCorrect(){
//        pattern = Pattern.compile("^\\d+\\s*[+-]\\s*\\d+$");
//        matcher = pattern.matcher(inputString);
        return matcher.matches();
    }
}
