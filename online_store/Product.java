import java.util.ArrayList;
import java.util.List;


interface Describable {
    String getDescription();
}

abstract class Product implements Describable {
    protected String name;
    protected double price;
    protected String category;

    private List<Review> reviews;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        reviews = new ArrayList<>();
    }

    public abstract double calculatePrice();
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public List<Review> getReviews() {
        return reviews;
    }
    
}
