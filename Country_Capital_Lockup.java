package Map_Assignment;
import java.util.*;

public class Country_Capital_Lockup {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("India", "New Delhi");
        map.put("USA", "Washington D.C.");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Japan", "Tokyo");
        map.put("Canada", "Ottawa");
        map.put("Australia", "Canberra");
        map.put("Brazil", "Brasilia");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter country name: ");
        String country = sc.nextLine();

        if (map.containsKey(country)) {
            System.out.println("Capital: " + map.get(country));
        } else {
            System.out.println("Unknown country");
        }

        Map<String, String> sorted = new TreeMap<>(map);

        System.out.println("\nAll countries and capitals (A–Z):");
        for (Map.Entry<String, String> e : sorted.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        sc.close();
    }
}




