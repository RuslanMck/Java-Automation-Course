package homework.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHelper {

    private Pattern pattern;
    private Matcher matcher;

    public int[] getArguments (String expression){
        pattern = Pattern.compile("(\\d+)");
        matcher = pattern.matcher(expression);


        List<Integer> resultsList = new ArrayList<Integer>();
        while (matcher.find()){
            resultsList.add(Integer.parseInt(matcher.group()));
        }

        int[] arr = new int[resultsList.size()];
        for (int i = 0; i < resultsList.size(); i++){
            arr[i] = resultsList.get(i);
        }

        for (Integer i : resultsList){
            System.out.println(i + " ");
        }

        return arr;
    }
}
