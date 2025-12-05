package Map_Assignment;
import java.util.*;

public class Course_Resitration_System {
    public static void main(String[] args) {
        Map<String, Integer> registrations = new HashMap<>();

        registrations.put("CS101", 45);
        registrations.put("CS201", 3);
        registrations.put("CS301", 52);
        registrations.put("CS401", 8);
        registrations.put("CS501", 60);

        System.out.println("Initial registrations:");
        printAll(registrations);

        addStudent(registrations, "CS101");
        addStudent(registrations, "CS201");
        dropStudent(registrations, "CS401");

        System.out.println("\nAfter changes:");
        printAll(registrations);

        System.out.println("\nNear full (≥ 50 students):");
        printNearFull(registrations, 50);

        System.out.println("\nUnder-subscribed (< 5 students):");
        printUnderSubscribed(registrations, 5);
    }

    static void addStudent(Map<String, Integer> map, String course) {
        map.put(course, map.getOrDefault(course, 0) + 1);
        System.out.println("Added to " + course + ": " + map.get(course));
    }

    static void dropStudent(Map<String, Integer> map, String course) {
        if (map.containsKey(course)) {
            int newCount = Math.max(0, map.get(course) - 1);
            map.put(course, newCount);
            System.out.println("Dropped from " + course + ": " + newCount);
        }
    }

    static void printAll(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    static void printNearFull(Map<String, Integer> map, int threshold) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() >= threshold) {
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
        }
    }

    static void printUnderSubscribed(Map<String, Integer> map, int threshold) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() < threshold) {
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
        }
    }
}




