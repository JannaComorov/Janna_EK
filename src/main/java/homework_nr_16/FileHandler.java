package homework_nr_16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    public static List<Person> readPeopleFromFile(String filePath) {
        List<Person> people = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    people.add(new Person(parts[0].trim(), Integer.parseInt(parts[1].trim()), Double.parseDouble(parts[2].trim())));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return null;
        }
        return people;
    }

    public static void writeResultsToFile(String filePath, double averageScore, Person youngest, Person oldest) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            bufferedWriter.write(String.format("Средний балл: %.1f%n", averageScore));
            bufferedWriter.write(String.format("Самый молодой человек: %s (Возраст: %d)%n", youngest.getName(), youngest.getAge()));
            bufferedWriter.write(String.format("Самый старший человек: %s (Возраст: %d)%n", oldest.getName(), oldest.getAge()));
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
