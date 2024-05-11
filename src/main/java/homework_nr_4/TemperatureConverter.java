package homework_nr_4;

public class TemperatureConverter {
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double toFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        double celsiusTemp = 37.0;
        double fahrenheitTemp = 451.0;

        System.out.println(celsiusTemp + " градусов Цельсия = " + toFahrenheit(celsiusTemp) + " градусов Фаренгейта");
        System.out.println(fahrenheitTemp + " градусов Фаренгейта = " + toCelsius(fahrenheitTemp) + " градусов Цельсия");
    }
}
