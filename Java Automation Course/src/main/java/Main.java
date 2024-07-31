import homework.Car;
import homework.Registration;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Set<Car> cars1 = new HashSet<>();
//
//        cars1.add(new Car("BMW", 2011));
//        cars1.add(new Car("Mazda", 2005));
//        cars1.add(new Car("Ford", 2024));
//        cars1.add(new Car("Ford", 2003));
//        cars1.add(new Car("Lamborghini", 2022));
//
//
//        Set<Car> cars2 = new HashSet<>();
//
//        cars2.add(new Car("Opel", 2020));
//        cars2.add(new Car("Suzuki", 1995));
//        cars2.add(new Car("Lamborghini", 2022));
//        cars2.add(new Car("Ford", 2018));
//        cars2.add(new Car("Mazda", 2010));
//        cars2.add(new Car("Mazda", 2005));
//
//        Set<Car> unionSet = new HashSet<>(cars1);
//        unionSet.addAll(cars2);
//
//        System.out.println("Union Set:");
//        for(Car i : unionSet){
//            System.out.println(i.getName());
//        }
//
//        Set<Car> intersectionSet = new HashSet<>(cars1);
//        intersectionSet.retainAll(cars2);
//
//
//        System.out.println("Intersection Set:");
//        for(Car i : intersectionSet){
//            System.out.println(i.getName());
//        }



        if(Registration.checkRegistration("asd123_","asd123_", "asd123_")){
            System.out.println("We are registered");
        }

    }
}