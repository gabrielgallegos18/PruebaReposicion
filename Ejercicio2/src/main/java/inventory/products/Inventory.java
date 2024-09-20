package inventory.products;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    // Method to add a product to the inventory
    public boolean addProduct(Product product) {
        for (Product p : products) {
            if (p.getCode().equals(product.getCode())) {
                System.out.println("Error: Product with code " + product.getCode() + " already exists.");
                return false;
            }
        }
        products.add(product);
        System.out.println("Product added: " + product.getName());
        return true;
    }

    // Method to update the quantity of a product
    public boolean updateQuantity(String code, int newQuantity) {
        for (Product p : products) {
            if (p.getCode().equals(code)) {
                p.setQuantity(newQuantity);
                System.out.println("Quantity updated for product: " + p.getName());
                return true;
            }
        }
        System.out.println("Error: Product not found.");
        return false;
    }

    // Method to remove products with zero quantity
    public void removeProductsWithZeroQuantity() {
        products.removeIf(p -> p.getQuantity() == 0);
        System.out.println("Products with zero quantity removed.");
    }

    // Method to display the entire inventory
    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("The inventory is empty.");
        } else {
            System.out.println("Inventory:");
            for (Product p : products) {
                p.displayInformation();
            }
        }
    }
}