package builtin_functions;
import java.time.LocalDate;
import java.util.Scanner;

public class date_comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date (YYYY-MM-DD): ");
        LocalDate firstDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        LocalDate secondDate = LocalDate.parse(scanner.nextLine());

        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the same.");
        }

        scanner.close();
    }
}
