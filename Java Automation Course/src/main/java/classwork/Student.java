package classwork;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student other){
        return this.name.compareTo(other.name);
    }
}
