package builtin_functions;
import java.util.Random;
import java.util.Scanner;

public class numberguess {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        int low = 1;
        int high = 100;
        boolean correct = false;

        while (!correct && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getUserFeedback(guess);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Hooray! The computer guessed your number: " + guess);
                correct = true;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }

        if (!correct) {
            System.out.println("Hmm, it seems there might be some inconsistency in your feedback.");
        }
    }

    // Generate a random guess between low and high (inclusive)
    public static int generateGuess(int low, int high) {
        return low + random.nextInt(high - low + 1);
    }

    // Get feedback from user: high, low, or correct
    public static String getUserFeedback(int guess) {
        System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
        return scanner.nextLine().trim();
    }
}
