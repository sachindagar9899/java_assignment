package whapper;
import java.util.ArrayList;
import java.util.Objects;

public class procuct_rating_analyzer {
    public static void main(String[] args) {
        // Primitive int array of ratings
        int[] primitiveRatings = {4, 5, 3, 4};

        // ArrayList of Integer ratings including some nulls
        ArrayList<Integer> objectRatings = new ArrayList<>();
        objectRatings.add(5);
        objectRatings.add(null);
        objectRatings.add(2);
        objectRatings.add(4);
        objectRatings.add(null);

        // Combine both into a single ArrayList<Integer>
        ArrayList<Integer> allRatings = new ArrayList<>();

        // Add primitive ratings (auto-boxing)
        for (int rating : primitiveRatings) {
            allRatings.add(rating);
        }

        // Add object ratings, filter out nulls
        for (Integer rating : objectRatings) {
            if (Objects.nonNull(rating)) {
                allRatings.add(rating);
            }
        }

        // Calculate average rating
        int sum = 0;
        for (Integer rating : allRatings) {
            sum += rating;  // auto-unboxing
        }
        double average = allRatings.isEmpty() ? 0.0 : (double) sum / allRatings.size();

        System.out.println("Average rating = " + average);
    }
}

