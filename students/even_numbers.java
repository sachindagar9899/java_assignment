package students;
import java.util.Scanner;
import static java.lang.System.out;

public class even_numbers {
	public static void main(String[] arg) {
		int n=50;
	
		while(n>=10) {
			int cd = n%2;
			if(cd==0) {
				System.out.println(cd + "even " + n );
			}
			else {
				System.out.println(cd + " odd " + n);
			}
			
			n--;
		}
	}
	

}
