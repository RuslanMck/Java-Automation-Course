package homework;

import java.util.ArrayList;
import java.util.List;

public class Books implements Printable{

    private String name;

    public Books(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print(){
        System.out.println("name: " + this.name);
    }



    public static void printBooks (List<Printable> printableList){
        for (Printable i : printableList){
            if (i instanceof Books){
                System.out.println("name of the book: " + i.getName());
            }
        }
    }
}
