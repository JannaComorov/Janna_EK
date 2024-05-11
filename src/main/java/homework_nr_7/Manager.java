package homework_nr_7;

public class Manager extends Employee {
    private int teamSize;
    private String teamName;

    public Manager(String name, String surname, String companyName, int teamSize, String teamName) {
        super(name, surname, companyName);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("The manager oversees daily operations and ensures organizational goals are met.");
        System.out.println(" _________________________________");
    }
}
