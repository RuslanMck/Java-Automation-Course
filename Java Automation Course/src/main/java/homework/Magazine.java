package homework;

import java.util.List;

public class Magazine implements Printable{

    private String name;

    public Magazine(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void print(){
        System.out.println("name: " + this.name);
    }

    public static void printMagazine (List<Printable> printableList){
        for (Printable i : printableList){
            if (i instanceof Magazine){
                System.out.println("Magazine name: " + i.getName());
            }
        }
    }
}
