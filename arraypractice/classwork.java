package arraypractice;
import java.util.Scanner;
import static java.lang.System.out;
public class classwork {
	public static void main(String[] abc) {
		Scanner sc = new Scanner(System.in);
		int[] oneDArray = {10,20,30,40,50};
		int key = 60;
		int count = 0;
		for(int i = 0;i<oneDArray.length;i++) {
			if (key==oneDArray[i]) {
				count++;
			}
		}
		if(count%2==0 && count%3==0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}

}
