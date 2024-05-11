package homework_nr_6;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        // Validarea zilei pentru a fi în intervalul 1-31
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Ziua introdusă nu este validă.");
        }
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {

        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Luna introdusă nu este validă.");
        }
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Metodă pentru afișarea datei
    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
