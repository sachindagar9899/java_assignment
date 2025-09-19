package practicesheet1;
import java.util.*;
import static java.lang.System.out;
public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1st side of triangle: ");// in meter
		int a = sc.nextInt();
		System.out.println(" 2nd side of triangle: ");// in meter 
		int b = sc.nextInt();
		System.out.println(" 3rd side of triangle: ");// in meter
		int c = sc.nextInt();
		int para = a+b+c;
		System.out.println("parametr of triangle: "+ para);
		int roundlength = 5;
		int roundinmeter = 1000*roundlength;
		int round = roundinmeter/para;
		System.out.println("no of rounds: "+round);
	}
	

}
