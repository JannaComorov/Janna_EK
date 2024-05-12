package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD(number -> number % 2 != 0),
    CHECK_IF_EVEN(number -> number % 2 == 0),
    CHECK_IF_NEGATIVE(number -> number < 0),
    CHECK_IF_POSITIVE(number -> number > 0);

    private Predicate<Integer> condition;

    CheckInteger(Predicate<Integer> condition) {
        this.condition = condition;
    }

    public Predicate<Integer> getCondition() {
        return condition;
    }

    public static void main(String[] args) {
        int number = -3;
        System.out.println("Number: " + number);
        for (CheckInteger check : CheckInteger.values()) {
            System.out.println(check + ": " + check.getCondition().test(number));
        }
    }
}
