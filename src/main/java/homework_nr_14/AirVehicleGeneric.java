package homework_nr_14;

import java.io.Serializable;

public class AirVehicleGeneric<T extends Vehicle & Serializable> {
    private T vehicle;

    public AirVehicleGeneric(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }
}
