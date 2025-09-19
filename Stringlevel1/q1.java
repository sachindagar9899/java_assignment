package Stringlevel1;
import java.util.Scanner;
import static java.lang.System.out;
public class q1 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("pleaase enter your string1: ");
		String sach =sc.next();
		System.out.println("pleaase enter your string2: ");
		String in = sc.next();
		if (sach.equals(in)) {
			out.println("equal");
		}
		else {
			out.println("not equal");
		}
		 if(sach.charAt(2)==in.charAt(2)) {
				out.println("Same");
			
			
			}
		 else {
				out.println("not same");
			}
		}

		
		
		
	
}
