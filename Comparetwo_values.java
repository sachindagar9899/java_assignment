package Generic_problem;
public class Comparetwo_values {
    public static <T> boolean isEqual(T a, T b) {
        if (a == null) {
            return b == null;
        }
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(10, 10));              // true
        System.out.println(isEqual("hello", "hello"));    // true
        System.out.println(isEqual(5.5, 5.6));            // false
        System.out.println(isEqual(null, null));          // true
        System.out.println(isEqual(null, "test"));        // false
    }
}


