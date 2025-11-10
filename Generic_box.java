package Generic_problem;
class Box<T> {
    private T value; 
   
    public void set(T value) {
        this.value = value;
    }

   
    public T get() {
        return value;
    }
}


public class Generic_box {
    public static void main(String[] args) {
        
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Integer value: " + intBox.get());

        
        Box<String> strBox = new Box<>();
        strBox.set("Hello Java");
        System.out.println("String value: " + strBox.get());

        
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.1416);
        System.out.println("Double value: " + doubleBox.get());
    }
}
