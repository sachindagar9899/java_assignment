package practicesheet1;
import java.util.*;
import static java.lang.System.out;
public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the Date ");
		int d = sc.nextInt();
		System.out.println(" enter the month: ");
		int m = sc.nextInt();
		if (d>20 && d<31 && m==3) {
			System.out.println(" True");
		}
		else if(d>1 && d<30 && m==4) {
			System.out.println(" True");
		}
		else if(d>1 && d<31 && m==5) {
			System.out.println(" True ");
		}
		else if(d>1 && d<30 && m==6) {
			System.out.println(" True ");
		}
		else {
			System.out.println(" False ");
		}

		
	}

}
