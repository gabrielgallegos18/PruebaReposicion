package inventory.products;

public class Product {
        private String code;
        private String name;
        private int quantity;
        private double price;

        public Product(String code, String name, int quantity, double price) {
            this.code = code;
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        // Getter and Setter methods
        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        // Method to display product information
        public void displayInformation() {
            System.out.println("Code: " + code + ", Name: " + name +
                    ", Quantity: " + quantity + ", Price: " + price);
        }
    }

