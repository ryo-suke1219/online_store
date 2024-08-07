import java.util.ArrayList;
import java.util.List;


class AdminUser extends User {
    private List<Product> productCatalog;

    public AdminUser(String username, String password) {
        super(username, password);
        this.productCatalog = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productCatalog.add(product);
        System.out.println("Product added: " + product.getDescription());
    }

    public void removeProduct(Product product) {
        productCatalog.remove(product);
        System.out.println("Product removed: " + product.getDescription());
    }

    public void displayProductCatalog() {
        System.out.println("Product catalog:");
        for (Product product : productCatalog) {
            System.out.println(product.getDescription());
        }
    }
}
