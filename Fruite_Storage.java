package Generic_problem;
class Fruit {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Mango extends Fruit {
    public String toString() {
        return "Mango";
    }
}

class FruitBox<T extends Fruit> {
    private java.util.ArrayList<T> fruits = new java.util.ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void display() {
        for (T fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

class Car {
    public String toString() {
        return "Car";
    }
}

public class Fruite_Storage {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.display();

        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango());
        mangoBox.display();

        // The following line will cause a compile-time error
        // FruitBox<Car> carBox = new FruitBox<>();
        // carBox.add(new Car());
    }
}



