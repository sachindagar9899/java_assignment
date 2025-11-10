package Generic_problem;
import java.util.List;

public class Copy_list_elements {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number num : src) {
            dest.add(num);
        }
    }

    public static void main(String[] args) {
        List<Number> dest = new java.util.ArrayList<>();
        List<Integer> src = List.of(1, 2, 3, 4);

        copyList(dest, src);

        System.out.println("Destination list after copy:");
        for (Object num : dest) {
            System.out.println(num);
        }
    }
}


