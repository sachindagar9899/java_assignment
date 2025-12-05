package Map_Assignment;
import java.util.*;

public class Library_Book_CAtalog {
    public static void main(String[] args) {
        Map<String, String> catalog = new HashMap<>();

        catalog.put("978-1234567890", "Java Basics");
        catalog.put("978-1111111111", "Data Structures");
        catalog.put("978-2222222222", "Operating Systems");
        catalog.put("978-3333333333", "Computer Networks");

        String isbnToSearch = "978-1111111111";
        if (catalog.containsKey(isbnToSearch)) {
            System.out.println("Found: " + catalog.get(isbnToSearch));
        } else {
            System.out.println("Book not found");
        }

        String isbnToRemove = "978-3333333333";
        catalog.remove(isbnToRemove);

        Map<String, String> sortedCatalog = new TreeMap<>(catalog);

        System.out.println("All books (sorted by ISBN):");
        for (Map.Entry<String, String> entry : sortedCatalog.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        String titleToSearch = "Operating Systems";
        boolean found = false;
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            if (entry.getValue().equals(titleToSearch)) {
                System.out.println("Found title at ISBN: " + entry.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Title not found");
        }
    }
}

