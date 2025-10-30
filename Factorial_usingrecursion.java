package builtin_functions;
import java.util.Scanner;

public class Factorial_usingrecursion {
    public static void main(String[] args) {
        int number = takeInput();
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
    }

    // Function to take input from user
    public static int takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    // Function to display the result
    public static void displayResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

