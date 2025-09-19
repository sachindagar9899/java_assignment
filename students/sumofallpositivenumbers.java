package students;
import java.util.Scanner;
import static java.lang.System.out;
public class sumofallpositivenumbers {
	public static void main(String[] arg) {
		Scanner sc = new Scanner((Readable) System.out);
		
		    int n;
	        int sum = 0;

	        while (true) {
	            System.out.print("Enter a number (negative number to stop): ");
	            n = sc.nextInt();

	            if (n < 0) {
	                break;
	            }

	            sum += n;
	        }

	        System.out.println("The sum of all positive numbers entered is: " + sum);
	        sc.close();
	}

}
