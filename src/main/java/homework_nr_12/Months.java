package homework_nr_12;

public enum Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    public static void main(String[] args) {
        System.out.println("All months:");
        for (Months month : Months.values()) {
            System.out.println(month);
        }
    }
}
