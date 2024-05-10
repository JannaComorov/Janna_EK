package homework_nr_16;

import java.util.List;

public class PersonManager {
    public static double calculateAverageScore(List<Person> people) {
        if (people.isEmpty()) return 0.0;
        double totalScore = 0;
        for (Person p : people) {
            totalScore += p.getScore();
        }
        return totalScore / people.size();
    }

    public static Person findYoungestPerson(List<Person> people) {
        Person youngest = null;
        for (Person p : people) {
            if (youngest == null || p.getAge() < youngest.getAge()) {
                youngest = p;
            }
        }
        return youngest;
    }

    public static Person findOldestPerson(List<Person> people) {
        Person oldest = null;
        for (Person p : people) {
            if (oldest == null || p.getAge() > oldest.getAge()) {
                oldest = p;
            }
        }
        return oldest;
    }
}
