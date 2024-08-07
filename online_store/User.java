import java.util.ArrayList;
import java.util.List;

class User {
    protected String username;
    protected String password;
    protected List<Order> orderHistory;
    protected ShoppingCart cart;
    protected List<Address> addresses;
    protected List<PaymentMethod> paymentMethods;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.orderHistory = new ArrayList<>();
        this.cart = new ShoppingCart();
        this.addresses = new ArrayList<>();
        this.paymentMethods = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public void addPaymentMethod(PaymentMethod paymentMethod) {
        paymentMethods.add(paymentMethod);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }
}
