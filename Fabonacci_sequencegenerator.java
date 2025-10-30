package builtin_functions;
import java.util.Scanner;

public class Fabonacci_sequencegenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int terms = scanner.nextInt();

        System.out.println("Fibonacci sequence:");
        printFibonacci(terms);

        scanner.close();
    }

    // Function to calculate and print Fibonacci sequence up to n terms
    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}

