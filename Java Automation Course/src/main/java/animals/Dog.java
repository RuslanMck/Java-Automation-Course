package animals;



public class Dog extends Animal {


    public Dog(String name, int age, int price) {
        super(name, age, price);

    }

    public void bark() {
        System.out.println("Bark");
    }


}
