package main.java.toys;

import main.java.Price;

public class Doll extends Toy implements Price {

    private int price;

    public Doll (String name, String color, int price){
        super(name, color);
        this.price = price;
    }

    public void saySomething(){
        System.out.println("Doll saying something");
    }

    @Override
    public int price(){
        return price;
    }
}
