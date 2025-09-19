package arraypractice;
import java.util.Scanner;
import static java.lang.System.out;
public class classwrk2 {
	public static void main(String[] erg) {
		Scanner sc = new Scanner(System.in);
		int[] oneDArray = {10,78,45,41,56,80,46};
		int key = 45;
		int count = 0;
		for (int i = 0; i<oneDArray.length;i++) {
			if (key == oneDArray[i]) {
				count++;
			}
		}
		if (count%10==0) {
			System.out.println("this no is divisible by 10 ");
			
		}
		else {
			System.out.println("not divisble by 10");
		}
			
		}
	}





