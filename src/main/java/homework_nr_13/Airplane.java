package homework_nr_13;

import java.util.ArrayList;
import java.util.List;

public class Airplane {
    private String manufacturer;
    private String model;
    private int nrOfEngines;
    private List<Airplane> airplaneList;

    public Airplane(String manufacturer, String model, int nrOfEngines) throws InvalidManufacturerException, InvalidModelException, InvalidNrOfEnginesException {
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new InvalidManufacturerException("Manufacturer cannot be null or empty");
        }
        if (model == null || model.isEmpty()) {
            throw new InvalidModelException("Model cannot be null or empty");
        }
        if (nrOfEngines == 0 || nrOfEngines % 2 != 0) {
            throw new InvalidNrOfEnginesException("Number of engines must be a non-zero even number");
        }

        this.manufacturer = manufacturer;
        this.model = model;
        this.nrOfEngines = nrOfEngines;
        this.airplaneList = new ArrayList<>();
    }

    public void addAirplaneToList(Airplane airplane) {
        this.airplaneList.add(airplane);
    }

    public Airplane findAirplaneByManufacturer(String manufacturer) throws InvalidManufacturerException {
        return airplaneList.stream()
                .filter(e -> e.manufacturer.equals(manufacturer))
                .findFirst()
                .orElseThrow(() -> new InvalidManufacturerException("Airplane not found in the list!"));
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNrOfEngines() {
        return nrOfEngines;
    }

    public void setNrOfEngines(int nrOfEngines) {
        this.nrOfEngines = nrOfEngines;
    }

    public List<Airplane> getAirplaneList() {
        return airplaneList;
    }

    public void setAirplaneList(List<Airplane> airplaneList) {
        this.airplaneList = airplaneList;
    }
}
