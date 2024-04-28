package homework_nr_14;

public class Main {
    public static void main(String[] args) {
        // Testarea GenericClass cu tipuri numerice
        GenericClass<Integer> integerGeneric = new GenericClass<>(123);
        System.out.println("Valoarea integer este: " + integerGeneric.getValue());

        GenericClass<Double> doubleGeneric = new GenericClass<>(456.789);
        System.out.println("Valoarea double este: " + doubleGeneric.getValue());

        // Testarea AirVehicleGeneric cu tipuri de vehicule aeriene
        Airplane airplane = new Airplane();
        AirVehicleGeneric<Airplane> airplaneGeneric = new AirVehicleGeneric<>(airplane);
        System.out.println("Obiectul Airplane a fost creat pentru AirVehicleGeneric.");

        Helicopter helicopter = new Helicopter();
        AirVehicleGeneric<Helicopter> helicopterGeneric = new AirVehicleGeneric<>(helicopter);
        System.out.println("Obiectul Helicopter a fost creat pentru AirVehicleGeneric.");
    }
}
