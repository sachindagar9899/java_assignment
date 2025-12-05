package Map_Assignment;
import java.util.*;

public class Word_Frequency_in_a_Sentence {
    public static void main(String[] args) {
        String sentence = "Java is fun, and Java is powerful!";
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("[^a-z0-9\\s]", "");

        String[] words = sentence.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            if (freq.containsKey(word)) {
                freq.put(word, freq.get(word) + 1);
            } else {
                freq.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

