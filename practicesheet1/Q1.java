package practicesheet1;
import java.util.*;
import static java.lang.System.out;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Principle amount: ");
		int P = sc.nextInt();
		System.out.println("enter the rate: ");
		int R = sc.nextInt();
		System.out.println("enter the time: ");
		int T = sc.nextInt();
		int interest = (P*R*T)/100;
		
		System.out.println("simple interest: "+ interest);
		
	}

}
