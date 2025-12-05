package Map_Assignment;
import java.util.*;

public class Student_Attendence_tracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();

        String[] students = {"Alice", "Bob", "Charlie", "David", "Eva"};
        for (String s : students) {
            attendance.put(s, 0);
        }

        List<List<String>> monthAttendance = Arrays.asList(
                Arrays.asList("Alice", "Bob", "Charlie"),
                Arrays.asList("Alice", "David"),
                Arrays.asList("Bob", "Charlie", "Eva"),
                Arrays.asList("Alice", "Eva"),
                Arrays.asList("Charlie", "David"),
                Arrays.asList("Alice", "Bob", "Eva"),
                Arrays.asList("Bob", "Charlie"),
                Arrays.asList("Alice", "David", "Eva"),
                Arrays.asList("Bob", "Charlie"),
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Charlie", "David"),
                Arrays.asList("Alice", "Eva"),
                Arrays.asList("Bob", "Charlie"),
                Arrays.asList("Alice", "David"),
                Arrays.asList("Charlie", "Eva")
        );

        for (List<String> presentList : monthAttendance) {
            for (String name : presentList) {
                attendance.put(name, attendance.get(name) + 1);
            }
        }

        System.out.println("Total days present:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        int threshold = 10;
        System.out.println("\nStudents present fewer than " + threshold + " days:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < threshold) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}


