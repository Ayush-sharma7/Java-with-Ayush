import java.util.*;

class Product {
    private int productId;
    private String productName;
    private String category;
    private double price;

    public Product(int productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("id: " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
    }

    public double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void updatePrice(double newPrice) {
        try {
            if (newPrice <= 0) {
                throw new IllegalArgumentException("Price must be greater than zero");
            }
            this.price = newPrice;
            System.out.println("Price updated successfully.");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception handled: " + e.getMessage());
        } finally {
            System.out.println("Price update operation completed.");
        }
    }
}

public class ProductMain {
    public static void main(String[] args) {
        Product obj1 = new Product(101, "Laptop", "Electronics", 5000);
        obj1.displayProduct();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Query");
        String query = sc.next();

        switch (query.toUpperCase()) {
            case "UPDATE":
                String priceStr = sc.next();
                try {
                    double newPrice = Double.parseDouble(priceStr);
                    obj1.updatePrice(newPrice);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid price entered. Please enter a valid numeric value.");
                }
                break;

            case "DISPLAY":
                obj1.displayProduct();
                break;

            case "PRODUCTID":
                System.out.println(obj1.getProductId());
                break;

            case "SETPRICE":
                String newPriceStr = sc.next();
                try {
                    double newPrice = Double.parseDouble(newPriceStr);
                    obj1.setPrice(newPrice);
                    System.out.println("Price set successfully.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid price entered. Please enter a valid numeric value.");
                }
                break;

            case "GETPRICE":
                System.out.println(obj1.getPrice());
                break;

            default:
                System.out.println("Invalid query.");
                break;
        }

        sc.close();
    }
} 