import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        User user = new User("user1", "password");
        ShoppingCart cart = user.getCart();
        Coupon coupon = new Coupon("DISCOUNT10", 10.0);
        AdminUser admin = new AdminUser("admin", "adminpassword");

        Scanner scanner = new Scanner(System.in);
        
        // Admin adding products
        Product laptop = new Electronics("Laptop", 1000.00, "Dell", 24);
        Product shirt = new Clothing("Shirt", 50.00, "L", "Blue");
        Product book = new Book("Java Programming", 30.00, "Author Name", 500);

        admin.addProduct(laptop);
        admin.addProduct(shirt);
        admin.addProduct(book);

        admin.displayProductCatalog();

        // User adding products to the cart
        cart.addProduct(laptop);
        cart.addProduct(shirt);
        cart.addProduct(book);

        // Display products
        System.out.println("Products in cart:");
        cart.displayProducts();

        // Calculate total price
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total price: $" + totalPrice);

        // Apply coupon
        cart.addCoupon(coupon);
        totalPrice = cart.calculateTotalPrice();
        System.out.println("Total price after applying coupon: $" + totalPrice);

        // Remove product from cart
        cart.removeProduct(shirt);

        System.out.println("Products in cart after removing shirt:");
        cart.displayProducts();

        totalPrice = cart.calculateTotalPrice();
        System.out.println("Total price after removing shirt: $" + totalPrice);

        // Creating order
        Order order = new Order();
        for (Product product : cart.getProducts()) {
            order.addProduct(product);
        }
        user.addOrder(order);
        Review laptopReview = new Review("user1", 5, "Great laptop, very fast!");
        laptop.addReview(laptopReview);
        Review bookReview = new Review("user2", 4, "Very informative and well-written.");
        book.addReview(bookReview);

        // レビューを表示
        System.out.println("Product reviews:");
        for (Review review : laptop.getReviews()) {
            System.out.println(review);
        }
        for (Review review : book.getReviews()) {
            System.out.println(review);
        }
        // Adding address and payment method
        Address address = new Address("123 Main St", "Springfield", "IL", "62701");
        user.addAddress(address);
        PaymentMethod creditCard = new CreditCard("User One", "1234567890123456", "12/25");
        user.addPaymentMethod(creditCard);

        // Display order history
        System.out.println("Order history:");
        for (Order userOrder : user.getOrderHistory()) {
            System.out.println("Order date: " + userOrder.getOrderDate());
            for (Product product : userOrder.getProducts()) {
                System.out.println(product.getDescription());
            }
            System.out.println("Total price: $" + userOrder.getTotalPrice());
        }

        // Display addresses
        System.out.println("User addresses:");
        for (Address userAddress : user.getAddresses()) {
            System.out.println(userAddress.getFullAddress());
        }

        // Display payment methods
        System.out.println("User payment methods:");
        for (PaymentMethod paymentMethod : user.getPaymentMethods()) {
            System.out.println(paymentMethod.getPaymentDetails());
        }

        scanner.close();
    }
}
