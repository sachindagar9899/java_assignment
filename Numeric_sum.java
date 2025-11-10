package Generic_problem;
import java.util.List;

public class Numeric_sum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        List<Double> doubleList = List.of(1.5, 2.5, 3.5);

        System.out.println("Sum of Integer list: " + sumNumbers(intList));   // 15.0
        System.out.println("Sum of Double list: " + sumNumbers(doubleList)); // 7.5
    }
}


