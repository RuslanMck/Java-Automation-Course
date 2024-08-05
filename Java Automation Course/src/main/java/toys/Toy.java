package main.java.toys;

public abstract class Toy {
    protected String name;
    protected String color;

    public Toy(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void sayToy(){
        System.out.println("Say Toy");
    }
}
