package Map_Assignment;
import java.util.*;

public class Voting_counter {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] allVotes = {
                "Alice", "Bob", "Alice", "Charlie", "Bob",
                "Alice", "Charlie", "Alice", "Bob", "Alice"
        };

        for (String candidate : allVotes) {
            if (votes.containsKey(candidate)) {
                votes.put(candidate, votes.get(candidate) + 1);
            } else {
                votes.put(candidate, 1);
            }
        }

        String winner = null;
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            String candidate = entry.getKey();
            int count = entry.getValue();
            if (count > maxVotes) {
                maxVotes = count;
                winner = candidate;
            }
        }

        System.out.println("Vote count:");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Winner: " + winner + " with " + maxVotes + " votes");
    }
}


