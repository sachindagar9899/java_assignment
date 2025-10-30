package builtin_functions;
import java.util.Scanner;

public class maxof_threenumbers {
    public static void main(String[] args) {
        int[] numbers = takeInput();
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);
        System.out.println("The maximum number is: " + max);
    }

    // Function to take three integer inputs from the user
    public static int[] takeInput() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("Enter three integers:");
        for (int i = 0; i < 3; i++) {
            nums[i] = scanner.nextInt();
        }
        return nums;
    }

    // Function to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}

