
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getter 메서드들
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}

public class SplitLoop {
    List<Product> products;

    public SplitLoop(List<Product> products) {
        this.products = products;
    }

    public void processProducts() {
        double totalCost = 0;
        double highestPrice = 0;
        Product mostExpensiveProduct = null;

        for (Product product : products) {
            // 총 비용 계산 (기능 1)
            totalCost += product.getPrice();

            // 가장 비싼 제품 찾기 (기능 2)
            if (product.getPrice() > highestPrice) {
                highestPrice = product.getPrice();
                mostExpensiveProduct = product;
            }

            // 재고 상태 출력 (기능 3)
            System.out.println("반복문쪼개기.Product: " + product.getName() + ", Stock: " + product.getStock());
        }

        // 최종 처리 결과 출력
        System.out.println("Total Cost: " + totalCost);
        if (mostExpensiveProduct != null) {
            System.out.println("Most Expensive 반복문쪼개기.Product: " + mostExpensiveProduct.getName());
        }
    }


    public static void main(String[] args) {
        // 제품 리스트 생성

        ArrayList<Product> productList = new ArrayList<>( Arrays.asList(
                new Product("Laptop", 1000.0, 5),
                new Product("Smartphone", 800.0, 10),
                new Product("Tablet", 600.0, 7)
        ));

        // 제품 처리기 생성 및 처리
        SplitLoop processor = new SplitLoop(productList);
        processor.processProducts();
    }
}

