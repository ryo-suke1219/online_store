import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Order {
    private LocalDateTime orderDate;
    private List<Product> products;
    private double totalPrice;

    public Order() {
        this.orderDate = LocalDateTime.now();
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product product) {
        products.add(product);
        totalPrice += product.calculatePrice();
    }

    public void removeProduct(Product product) {
        products.remove(product);
        totalPrice -= product.calculatePrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }
}
