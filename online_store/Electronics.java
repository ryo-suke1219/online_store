class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;

    public Electronics(String name, double price, String brand, int warrantyPeriod) {
        super(name, price, "Electronics");
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + name + ", Brand: " + brand + ", Warranty: " + warrantyPeriod + " months";
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
