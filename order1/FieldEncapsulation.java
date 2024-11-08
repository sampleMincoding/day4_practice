

public class FieldEncapsulation {

}

class Product {
    public String name;
    public double price;
    public int quantity;
}

class OrderService {
    public double calculateTotal(Product product){
        return product.price * product.quantity;
    }
    public void printReceipt(Product product) {
        System.out.println("Product: " +product.name);
        System.out.println("Total  : " +calculateTotal(product));
    }
}

class ShippingService {
    public double calculateAll(Product product) {
        return product.price * product.quantity;
    }

    public void printShippingLabel(Product product) {
        System.out.println("Shipping total: " + calculateAll(product));
    }
}