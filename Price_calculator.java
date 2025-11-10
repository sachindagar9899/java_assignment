package Generic_problem;
import java.util.List;

class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Mobile extends Product {
    public Mobile(double price) {
        super(price);
    }

    public String toString() {
        return "Mobile price: " + getPrice();
    }
}

class Laptop extends Product {
    public Laptop(double price) {
        super(price);
    }

    public String toString() {
        return "Laptop price: " + getPrice();
    }
}

public class Price_calculator {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = List.of(new Mobile(500.0), new Mobile(700.0));
        List<Laptop> laptops = List.of(new Laptop(1000.0), new Laptop(1200.0));

        System.out.println("Total price of mobiles: $" + calculateTotal(mobiles));
        System.out.println("Total price of laptops: $" + calculateTotal(laptops));
    }
}

