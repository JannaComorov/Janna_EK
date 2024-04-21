package homework_nr_7;

public class Programmer extends Employee {
    private String programmingLanguage;
    private int yearsOfExperience;

    public Programmer(String name, String surname, String companyName, String programmingLanguage, int yearsOfExperience) {
        super(name, surname, companyName);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }


    @Override
    public void work() {
        super.work();
        System.out.println("The programmer writes and tests code to develop and improve software according to technical requirements and specifications.");
        System.out.println(" _________________________________");
    }
}
