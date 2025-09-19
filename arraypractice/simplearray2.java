package arraypractice;
import java.util.Scanner;
import static java.lang.System.out;
public class simplearray2 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int [] ages = new int[1];
		for(int i = 0; i < ages.length;i++) {
			
			 System.out.print("Enter age of student " + (i + 1) + ": ");
	            ages[i] = sc.nextInt();
		}
		System.out.println("\n eligibility of account holding ");
		int count = 0;
		for (int i = 0; i < ages.length; i++) {
			int age = ages[i];
			if (i<16) {
				count++;
			
			}
			
		}
		
		if(count>0) {
			System.out.println("Student "  + ":  eligible to have account");
	
		}
		else {
			System.out.println("Student "  + ": not eligible to have account");
		}
	}
}
