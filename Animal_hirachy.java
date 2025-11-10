package Generic_problem;
import java.util.List;

class Animal {
    public String toString() {
        return "Animal";
    }
}

class Dog extends Animal {
    public String toString() {
        return "Dog";
    }
}

class Cat extends Animal {
    public String toString() {
        return "Cat";
    }
}

public class Animal_hirachy {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        System.out.println("Dogs:");
        printAnimals(dogs);

        System.out.println("Cats:");
        printAnimals(cats);
    }
}

