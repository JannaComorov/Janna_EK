package homework_nr_9;

public interface Animal {
    void makeSound();
    void eat();
    void run();
    int getAge();  // Корректное название для метода получения возраста

    // Метод по умолчанию
    default void breathe() {
        System.out.println("Breathing in, breathing out.");
    }

    // Статический метод
    static void getKingdom() {
        System.out.println("Animalia");
    }
}
