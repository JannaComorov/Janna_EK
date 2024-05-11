package homework_nr_7;

public abstract class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public abstract void work();  // Metoda abstractă implementată de subclase
}
