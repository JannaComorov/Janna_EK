package homework_nr_11;

import java.util.*;
import java.util.stream.Collectors;

public class HomeWorkNr11 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Concealer", "Powder", "", "Blush", "Bronzer", "Base", "Eyeshadow", "Mask", "Lash", "Highlighter");

        strings.stream()
                .filter(s -> s.contains("A") && s.length() < 5)
                .forEach(System.out::println);


        List<Person> persons = Arrays.asList(

        new Person("Tony", "Stark", 45, true),
                new Person("Steve", "Rogers", 100, true),
                new Person("Thor", "", 1500, true),
                new Person("Natasha", "Romanoff", 35, false),
                new Person("Bruce", "Banner", 45, true),
                new Person("Peter", "Parker", 20, true),
                new Person("Wanda", "Maximoff", 30, false),
                new Person("Vision", "", 5, true),
                new Person("T'Challa", "Wakanda", 35, true),
                new Person("Carol", "Danvers", 35, false)
);


        List<String> maleNamesUnder30 = persons.stream()
                .filter(Person::isMale)
                .filter(person -> person.getAge() < 30)
                .map(Person::getName)
                .collect(Collectors.toList());


        System.out.println("Male names under 30: " + maleNamesUnder30);


        Optional<Person> optionalPerson = persons.stream()
                .filter(person -> !person.isMale())
                .filter(person -> person.getAge() < 30)
                .filter(person -> person.getSurname().contains("P"))
                .findFirst();


        optionalPerson.ifPresent(person -> System.out.println("Found person: " + person));
    }
}
