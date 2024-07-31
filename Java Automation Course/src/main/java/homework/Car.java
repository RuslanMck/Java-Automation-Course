package homework;

import java.util.Objects;

public class Car {

    private String name;
    private int year;

    public Car (String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
