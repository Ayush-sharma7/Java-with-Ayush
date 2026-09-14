import java.util.*;

class StoreProduct {
    String name;
    int price;

    public StoreProduct(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class ProductStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of operations: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        StoreProduct parr[] = new StoreProduct[n];
        int productIndex = 0;

        for (int i = 0; i < n; i++) {
            String ope_str = sc.nextLine().trim();
            String parts[] = ope_str.split("\\s+");
            String op = parts[0];
            String prod = parts[1];

            switch (op) {
                case "ADD":
                    int addPrice = Integer.parseInt(parts[2]);
                    boolean isExist = false;
                    for (int j = 0; j < productIndex; j++) {
                        if (parr[j].name.equals(prod)) {
                            isExist = true;
                            break;
                        }
                    }
                    if (!isExist) {
                        parr[productIndex++] = new StoreProduct(prod, addPrice);
                    }
                    break;

                case "GET":
                    int onIndex = -1;
                    for (int j = 0; j < productIndex; j++) {
                        if (parr[j].name.equals(prod)) {
                            onIndex = j;
                            break;
                        }
                    }
                    if (onIndex != -1) {
                        System.out.println(parr[onIndex].price);
                    } else {
                        System.out.println("Product not found");
                    }
                    break;

                case "UPDATE":
                    int updatePrice = Integer.parseInt(parts[2]);
                    onIndex = -1;
                    for (int j = 0; j < productIndex; j++) {
                        if (parr[j].name.equals(prod)) {
                            onIndex = j;
                            break;
                        }
                    }
                    if (onIndex != -1) {
                        parr[onIndex].price = updatePrice;
                    } else {
                        System.out.println("Product not found");
                    }
                    break;
            }
        }
        sc.close();
    }
}
