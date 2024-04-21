package homework_nr_9;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра объекта Elephant через интерфейс животных
        Animal elephant = new Elephant(7);
        elephant.eat();
        elephant.run();
        elephant.makeSound();
        elephant.breathe();
        Animal.getKingdom();
        System.out.println("Age of elephant: " + elephant.getAge());

        // Создание объекта Elephant через родительский класс Erbivor
        Erbivor erbivorElephant = new Elephant(5);
        erbivorElephant.sleep();
        erbivorElephant.eatsOnlyGrass();
    }
}
