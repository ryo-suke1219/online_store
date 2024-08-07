import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products;
    private List<Coupon> coupons;

    public ShoppingCart() {
        products = new ArrayList<>();
        coupons = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void addCoupon(Coupon coupon) {
        coupons.add(coupon);
    }

    public void removeCoupon(Coupon coupon) {
        coupons.remove(coupon);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.calculatePrice();
        }
        for (Coupon coupon : coupons) {
            total -= coupon.getDiscountedPrice();
        }
        return total;
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product.getDescription());
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }
}
