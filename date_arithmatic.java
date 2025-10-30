package builtin_functions;
import java.time.LocalDate;
import java.util.Scanner;

public class date_arithmatic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (YYYY-MM-DD): ");
        String input = scanner.nextLine();

        LocalDate date = LocalDate.parse(input);

        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        modifiedDate = modifiedDate.minusWeeks(3);

        System.out.println("Resulting date after arithmetic: " + modifiedDate);

        scanner.close();
    }
}