package Map_Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Student_Grade_Tracker {
	 public static void main(String[] args) {
	        Map<String, Double> grades = new HashMap<>();

	        grades.put("Alice", 85.5);
	        grades.put("Bob", 72.0);
	        grades.put("Charlie", 90.0);
	        grades.put("David", 65.0);

	        grades.put("Bob", 78.5);

	        grades.remove("David");

	        Map<String, Double> sortedGrades = new TreeMap<>(grades);

	        for (Map.Entry<String, Double> entry : sortedGrades.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }
	    }

}
