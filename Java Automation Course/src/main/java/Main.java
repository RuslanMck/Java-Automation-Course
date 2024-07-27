import classwork.ComparatorByAge;
import classwork.Student;
import homework.Books;
import homework.Magazine;
import homework.Printable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Printable> booksAndMagazines = new ArrayList<>();

        booksAndMagazines.add(new Books("Dictionary"));
        booksAndMagazines.add(new Books("CookingBook"));
        booksAndMagazines.add(new Books("RomanticBook"));
        booksAndMagazines.add(new Magazine("NationalGeographic"));
        booksAndMagazines.add(new Magazine("NYTimes"));
        booksAndMagazines.add(new Magazine("Health"));
        booksAndMagazines.add(new Magazine("TopGear"));

        System.out.println("============ Using print() method ============");
        for (Printable i : booksAndMagazines) {
            i.print();
        }

        System.out.println("============ Using printBooks() method ============");

        Books.printBooks(booksAndMagazines);

        System.out.println("============ Using printMagazines() method ============");

        Magazine.printMagazine(booksAndMagazines);


//        ComparatorByAge comparatorByAge = new ComparatorByAge();
//
//        Student[] students = {
//                new Student("Bob", 23),
//                new Student("Xena", 45),
//                new Student("Carl",60),
//                new Student("Sam", 32),
//                new Student("Anna", 20)
//        };
//
//        for (Student student : students){
//            System.out.println(student.getName() + " " + student.getAge());
//        }
//
//        System.out.println("===============Sorted by name===============");
//        Arrays.sort(students);
//        for (Student student : students){
//            System.out.println(student.getName() + " " + student.getAge());
//        }
//        System.out.println("===============Sorted by age===============");
//        Arrays.sort(students, comparatorByAge);
//        for (Student student : students){
//            System.out.println(student.getName() + " " + student.getAge());
//        }
//
//        /**
//         * Lists */
//
//        List<Student> studentsList = new ArrayList<>();
//        studentsList.add(new Student("Bob", 23));
//        studentsList.add(new Student("Xena", 45));
//        studentsList.add(new Student("Carl",60));
//        studentsList.add(new Student("Sam", 32));
//        studentsList.add(new Student("Anna", 20));
//
//        studentsList.sort(comparatorByAge);


    }
}