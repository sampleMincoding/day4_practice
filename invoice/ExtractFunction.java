


public class ExtractFunction {

    public void printInvoice(Invoice invoice) {
        double totalAmount = 0;

        // Print header
        System.out.println("***** Invoice *****");
        System.out.println("날짜: " + invoice.getDate());
        System.out.println("고객: " + invoice.getCustomer().getName());

        // Print line items
        for (Item item : invoice.getItems()) {
            double amount = item.getPrice() * item.getQuantity();
            System.out.println(item.getName() + ": " + amount);
            totalAmount += amount;
        }

        // Print footer
        System.out.println("총액: " + totalAmount);
    }

    private class Invoice {
        public String getDate() {
            return null;
        }

        public Product getCustomer() {
            return null;
        }

        public Item[] getItems() {
            return new Item[0];
        }
    }

    private class Item {
        public double getPrice() {
            return 0;
        }

        public double getQuantity() {
            return 0;
        }

        public boolean getName() {
            return false;
        }
    }

    class Product {
        public String name;
        public double price;
        public int quantity;

        public String getName() {
            return null;
        }
    }
}
