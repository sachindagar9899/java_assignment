package assignment4;
import java.util.*;
import static java.lang.System.in;
public class naturalsumusingfor {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        if (n > 0) {
	            int sumFormula = n * (n + 1) / 2;
	            int sumFor = 0;
	            for (int i = 1; i <= n; i++) sumFor += i;
	            System.out.println("Formula sum: " + sumFormula + ", For loop sum: " + sumFor);
	        } else {
	            System.out.println("Not a natural number");
	        }
	    }

}
