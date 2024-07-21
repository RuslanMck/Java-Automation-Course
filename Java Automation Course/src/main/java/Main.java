import classwork.ComparatorByAge;
import classwork.Student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ComparatorByAge comparatorByAge = new ComparatorByAge();

        Student[] students = {
                new Student("Bob", 23),
                new Student("Xena", 45),
                new Student("Carl",60),
                new Student("Sam", 32),
                new Student("Anna", 20)
        };

        for (Student student : students){
            System.out.println(student.getName() + " " + student.getAge());
        }

        System.out.println("===============Sorted by name===============");
        Arrays.sort(students);
        for (Student student : students){
            System.out.println(student.getName() + " " + student.getAge());
        }
        System.out.println("===============Sorted by age===============");
        Arrays.sort(students, comparatorByAge);
        for (Student student : students){
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}