package homework_nr_13;

public class Main {
    public static void main(String[] args) {
        int nrOfEngines = 3;
        nrOfEngines(nrOfEngines);

        try {
            int inferiorLimit = 10;
            int superiorLimit = 30;
            int count = countDivisibleBy7Numbers(inferiorLimit, superiorLimit);
            System.out.println("Count of numbers divisible by 7 between " + inferiorLimit + " and " + superiorLimit + ": " + count);
        } catch (InvalidRangeException e) {
            System.out.println("Invalid range: " + e.getMessage());
        }
    }

    public static void nrOfEngines(int nrOfEngines) {
        if (nrOfEngines == 0) {
            System.out.println("Nr of Engines = 0");
        } else if (nrOfEngines % 2 != 0) {
            System.out.println("1 engine is missing");
        } else {
            System.out.println(nrOfEngines);
        }
    }

    public static int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Inferior limit cannot be greater than superior limit");
        }

        int count = 0;
        System.out.println("Numbers divisible by 7 between " + inferiorLimit + " and " + superiorLimit + ":");
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line after printing divisible numbers
        return count;
    }
}
