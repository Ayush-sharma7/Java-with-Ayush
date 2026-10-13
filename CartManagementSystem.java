class CartItem {
    private final int productId;
    private final String productName;
    private final double price;
    private int quantity;

    public CartItem(int productId, String productName, double price, int quantity) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Product price cannot be negative.");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Product quantity must be positive.");
        }

        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateSubtotal() {
        return price * quantity;
    }

    public void updateQuantity(int newQuantity) {
        if (newQuantity <= 0) {
            throw new IllegalArgumentException("Product quantity must be positive.");
        }
        quantity = newQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void displayItem() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product name: " + productName);
        System.out.printf("Product price: %.2f%n", price);
        System.out.println("Product quantity: " + quantity);
        System.out.printf("Subtotal: %.2f%n", calculateSubtotal());
    }
}

class ShoppingCart {
    private final CartItem[] items;
    private int itemCount;

    public ShoppingCart(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Cart capacity cannot be negative.");
        }
        items = new CartItem[capacity];
    }

    public void addItems(CartItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Cart item cannot be null.");
        }
        if (itemCount == items.length) {
            System.out.println("Cart is full. Item was not added: " + item.getProductName());
            return;
        }
        items[itemCount++] = item;
    }

    public void removeItems(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty.");
        }

        for (int i = 0; i < itemCount; i++) {
            if (items[i].getProductName().equalsIgnoreCase(name.trim())) {
                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[--itemCount] = null;
                System.out.println("Removed item: " + name);
                return;
            }
        }
        System.out.println("Item not found: " + name);
    }

    public void totalBill() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].calculateSubtotal();
        }
        System.out.printf("Total bill: %.2f%n", total);
    }

    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("Cart is empty.");
            return;
        }

        for (int i = 0; i < itemCount; i++) {
            items[i].displayItem();
            System.out.println("-------------------");
        }
    }
}

public class CartManagementSystem {
    public static void main(String[] args) {
        CartItem laptop = new CartItem(101, "Laptop", 67000, 1);
        CartItem mouse = new CartItem(102, "Mouse", 2000, 2);
        CartItem keyboard = new CartItem(103, "Keyboard", 1000, 1);
        CartItem ssd = new CartItem(104, "SSD", 9000, 1);

        ShoppingCart cart = new ShoppingCart(3);
        cart.addItems(laptop);
        cart.addItems(mouse);
        cart.addItems(keyboard);
        cart.addItems(ssd);

        cart.displayCart();
        cart.totalBill();

        System.out.println("===================");
        cart.removeItems("Mouse");
        cart.addItems(ssd);
        cart.displayCart();
        cart.totalBill();
    }
}
