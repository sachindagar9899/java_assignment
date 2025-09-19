package assignment4;
import java.util.*;
import static java.lang.System.in;
public class sumuntilzero {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double val = sc.nextDouble();
            if (val == 0) break;
            total += val;
        }
        System.out.println("Total sum: " + total);
    }

}
