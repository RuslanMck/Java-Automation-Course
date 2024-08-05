package main.java;

import main.java.animals.Animal;
import main.java.animals.Cat;
import main.java.animals.Dog;
import main.java.market.Market;
import main.java.toys.Car;
import main.java.toys.Doll;
import main.java.toys.Toy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Buyer buyer = new Buyer(500);

        Animal cat = new Cat("Cat_1", 1,10);
        Animal dog = new Dog("Dog_1", 2, 20);
        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);

        Toy doll = new Doll("Doll_1", "Yellow", 30);
        Toy car = new Car("Car_1", "White", 40);
        List<Toy> toyList = new ArrayList<>();
        toyList.add(doll);
        toyList.add(car);

        Market<Toy> toyMarket = new Market<>(toyList);
        toyMarket.getGoodsByIndex(0).sayToy();

        Market<Animal> animalMarket = new Market<>(animalList);
        animalMarket.getGoodsByIndex(0).sayAnimal();

    }
}