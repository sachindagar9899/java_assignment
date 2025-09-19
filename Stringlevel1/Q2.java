package Stringlevel1;
import java.util.*;
import static java.lang.System.out;
public class Q2 {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the String: ");
		String gla = sc.next();
		System.out.println("enter starting index: ");
		int st = sc.nextInt();
		System.out.println("enter ending index: ");
		int end = sc.nextInt();
		String shr = gla.substring(st,end);
		System.out.println("enter starting index: ");
		int sat = sc.nextInt(); 
		System.out.println("enter ending index: ");
		int ed = sc.nextInt();
		String ab = gla.substring(sat,ed);
		if(shr.equals(ab)) {
			System.out.println(" equal substring ");
		}
		else {
			System.out.println("not equal sub strings");
		}
		if (shr.charAt(2)==ab.charAt(2)) {
			System.out.println("equal char ");
		}
		else {
			System.out.println("not equal char");
		
	}

	}
}
