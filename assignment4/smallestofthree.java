package assignment4;
import java.util.*;
import static java.lang.System.in;
public class smallestofthree {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter three numbers: ");
	        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
	        System.out.println("Is the first number the smallest? " + (a < b && a < c));
	    }

}
