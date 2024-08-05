package main.java.toys;

import main.java.Price;

public class Car extends Toy implements Price {

    private int price;

    public Car (String name, String color, int price){
        super(name, color);
        this.price = price;
    }

    public void beep (){
        System.out.println("Car makes beep");
    }

    @Override
    public int price(){
        return price;
    }
}
