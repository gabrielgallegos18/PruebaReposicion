package inventory.products;


public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add products
        Product product1 = new Product("001", "Laptop", 5, 1000.99);
        Product product2 = new Product("002", "Mouse", 10, 25.99);
        Product product3 = new Product("003", "Keyboard", 7, 49.99);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // Display inventory
        inventory.displayInventory();

        // Try adding a duplicate product
        inventory.addProduct(new Product("001", "Laptop", 3, 999.99));

        // Update the quantity of a product
        inventory.updateQuantity("002", 20);

        // Remove products with zero quantity
        inventory.updateQuantity("003", 0);
        inventory.removeProductsWithZeroQuantity();

        // Display updated inventory
        inventory.displayInventory();
    }
}