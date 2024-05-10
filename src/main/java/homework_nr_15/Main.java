package homework_nr_15;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Set<Car> carsByYearDescending = new TreeSet<>();
        carsByYearDescending.add(new Car("Toyota Corolla", 2010));
        carsByYearDescending.add(new Car("Honda Crossroad", 2018));

        Comparator<Car> byNameComparator = Comparator.comparing(Car::getName);
        Set<Car> carsByName = new TreeSet<>(byNameComparator);
        carsByName.add(new Car("Toyota Corolla", 2010));
        carsByName.add(new Car("Honda Crossroad", 2018));


        System.out.println("Cars sorted by year made (descending):");
        for (Car car : carsByYearDescending) {
            System.out.println(car);
        }

        System.out.println("Cars sorted by name:");
        for (Car car : carsByName) {
            System.out.println(car);
        }
    }
}
