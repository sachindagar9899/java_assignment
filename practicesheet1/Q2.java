package practicesheet1;
import java.util.*;
import static java.lang.System.out;
public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no of Students: ");
		int n = sc.nextInt();
		int handshakes =  (n * (n - 1)) / 2 ;
		System.out.println("no of handshakes:"+ handshakes);
	}

}
