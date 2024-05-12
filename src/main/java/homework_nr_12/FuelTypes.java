package homework_nr_12;

public enum FuelTypes {
    GASOLINE(true),
    DIESEL(true),
    LPG(false),
    ELECTRICITY(false);

    private boolean isLiquid;

    FuelTypes(boolean isLiquid) {
        this.isLiquid = isLiquid;
    }

    public boolean isLiquidFuel() {
        return isLiquid;
    }

    public static void main(String[] args) {
        // verific metoda isLiquidFuel
        System.out.println("Fuel types:");
        for (FuelTypes fuel : FuelTypes.values()) {
            System.out.println(fuel + " is liquid fuel: " + fuel.isLiquidFuel());
        }
    }
}
