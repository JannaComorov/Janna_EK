package homework_nr_15;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private int yearMade;
    private String name;

    public Car(String name, int yearMade) {
        this.name = name;
        this.yearMade = yearMade;
    }

    // Implementarea Comparable, selecteaza dupa aani in ordine descrescatoare
    @Override
    public int compareTo(Car other) {
        return Comparator.comparingInt(Car::getYearMade).reversed().compare(this, other);
    }

    public int getYearMade() {
        return yearMade;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', yearMade=" + yearMade + '}';
    }
}
