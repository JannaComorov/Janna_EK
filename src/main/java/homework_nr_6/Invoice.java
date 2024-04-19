package homework_nr_6;

public class Invoice {
    private String model;
    private String description;
    private int quantity;
    private double price;

    public Invoice(String model, String description, int quantity, double price) {
        this.model = model;
        this.description = description;
        setQuantity(quantity); // Setarea cantității folosind metoda setter pentru a valida valoarea
        setPrice(price); // Setarea prețului folosind metoda setter pentru a valida valoarea
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public double getPrice() {
        return price;
    }


    // Metodă pentru calculul sumei facturii
    public double getAmount() {
        return quantity * price;
    }
}
