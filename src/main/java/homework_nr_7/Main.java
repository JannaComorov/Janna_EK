package homework_nr_7;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Ivan", "Rusk", "BNM", 30, "Management Team");
        Programmer programmer = new Programmer("Lungu", "Oktav", "Google", "C#", 2);

        // Apelarea metodelor work
        manager.work();
        programmer.work();

        // Crearea unui array de tip Person și adăugarea obiectelor
        Person[] personsArray = new Person[] {
                manager,
                programmer
        };

        // Parcurgerea array-ului și apelarea work doar pe instanțele de Manager
        for (Person person : personsArray) {
            if (person instanceof Manager) {
                person.work();
            }
        }
    }
}
