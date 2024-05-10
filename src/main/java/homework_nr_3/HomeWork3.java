package homework_nr_3;

public class HomeWork3 {
    public static void main(String[] args) {
        int number = 3;
        switch (number) {
            case 1:
                System.out.println("Ianuarie");
                break;
            case 2:
                System.out.println("Februarie");
                break;
            case 3:
                System.out.println("Martie");
                break;
            case 4:
                System.out.println("Aprilie");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Iunie");
                break;
            case 7:
                System.out.println("Iulie");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Septembrie");
                break;
            case 10:
                System.out.println("Octombrie");
                break;
            case 11:
                System.out.println("Noiembrie");
                break;
            case 12:
                System.out.println("Decembrie");
                break;
            default:
                System.out.println("Luna nu este cunoscută");
        }

        System.out.println("Numerele de la 100 la 1000 divizibile cu 5: ");
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        double sum = 0;

        for (int i = 1; i <= 97; i += 2) {
            // Adăugăm la sumă fiecare termen din serie: i / (i + 2)
            sum += (double) i / (i + 2);
        }
        System.out.println("Suma seriei este: " + sum);

    }
}
