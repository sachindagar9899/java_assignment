package builtin_functions;
import java.util.Scanner;

public class GCDand_LCM_calculator {
    public static void main(String[] args) {
        int[] inputs = takeInput();
        int a = inputs[0];
        int b = inputs[1];

        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    // Function to take two integers from user
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.close();
        return new int[] {num1, num2};
    }

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using relation: LCM * GCD = a * b
    public static int calculateLCM(int a, int b, int gcd) {
        return (a / gcd) * b;
    }
}
