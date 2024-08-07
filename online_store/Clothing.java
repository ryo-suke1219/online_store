class Clothing extends Product {
    private String size;
    private String color;

    public Clothing(String name, double price, String size, String color) {
        super(name, price, "Clothing");
        this.size = size;
        this.color = color;
    }

    @Override
    public String getDescription() {
        return "Clothing: " + name + ", Size: " + size + ", Color: " + color;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
