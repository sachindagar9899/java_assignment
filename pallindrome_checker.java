package builtin_functions;
import java.util.Scanner;

public class pallindrome_checker {
    public static void main(String[] args) {
        String input = getInput();
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }

    // Function to take input from the user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }

    // Function to check if the string is a palindrome
    public static boolean checkPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to display the result
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}

