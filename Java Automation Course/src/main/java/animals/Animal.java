package animals;



public abstract class Animal {
    protected String name;
    protected int age;
    protected int price;

    public Animal (String name, int age, int price){
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public int price(){
        return price;
    }

    public void sayAnimal(){
        System.out.println("Say Animal");
    }
}
