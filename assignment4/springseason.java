package assignment4;
import java.util.*;
import static java.lang.System.in;
public class springseason {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and day: ");
        int month = sc.nextInt();
        int day = sc.nextInt();
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

}
