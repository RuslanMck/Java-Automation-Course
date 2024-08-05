package main.java.animals;

import main.java.Price;

public class Cat extends Animal implements Price {

    private int price;

    public Cat(String name, int age, int price) {
        super(name, age);
        this.price = price;
    }

    public void meow() {
        System.out.println("Meow");
    }

    @Override
    public int price() {
        return price;
    }
}
