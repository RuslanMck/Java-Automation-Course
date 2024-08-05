package main.java.animals;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayAnimal(){
        System.out.println("Say Animal");
    }
}
