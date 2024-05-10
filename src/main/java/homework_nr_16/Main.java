package homework_nr_16;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputPath = "src/main/java/file_hw16/input.txt";
        String outputPath = "src/main/java/file_hw16/output.txt";

        List<Person> people = FileHandler.readPeopleFromFile(inputPath);
        if (people == null) {
            System.err.println("Failed to read people from file.");
            return;
        }

        double averageScore = PersonManager.calculateAverageScore(people);
        Person youngest = PersonManager.findYoungestPerson(people);
        Person oldest = PersonManager.findOldestPerson(people);

        FileHandler.writeResultsToFile(outputPath, averageScore, youngest, oldest);
    }
}
