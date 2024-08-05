

import animals.Animal;
import animals.Cat;
import animals.Dog;
import market.Market;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Buyer buyer = new Buyer(500);

        Cat cat1 = new Cat("Cat_1", 1,10);
        Cat cat2 = new Cat("Cat_2", 2,20);
        Dog dog1 = new Dog("Dog_1", 3, 30);
        Dog dog2 = new Dog("Dog_2", 4, 40);

        List<Cat> catList = new ArrayList<>();
        catList.add(cat1);
        catList.add(cat2);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog1);
        dogList.add(dog2);


        Market<Cat> catMarket = new Market<>(catList);
        catMarket.getGoodsByIndex(0).meow();


    }
}