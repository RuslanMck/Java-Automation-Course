package main.java.animals;

import main.java.Price;

public class Dog extends Animal implements Price {

    private int price;

    public Dog(String name, int age, int price){
        super(name, age);
        this.price = price;
    }

    public void bark(){
        System.out.println("Bark");
    }

    @Override
    public int price(){
        return price;
    }
}
