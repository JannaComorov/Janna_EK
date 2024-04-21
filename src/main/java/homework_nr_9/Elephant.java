package homework_nr_9;

public class Elephant extends Erbivor implements Animal {
    private int age;  // Varsta elefantului

    public Elephant(int age) {
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;  // Returneaza varsta elefantului
    }

    @Override
    public void eat() {
        System.out.println("The elephant eats grass.");
    }

    @Override
    public void makeSound() {
        System.out.println("Elephant is trumpeting.");
    }

    @Override
    public void run() {
        System.out.println("Elephant is running.");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant is sleeping.");
    }
}
