package assighnment3;
import java.util.*;
import static java.lang.System.in;
public class Quitientremainder {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double feet = sc.nextDouble();
	        double yards = feet / 3;
	        double miles = yards / 1760;
	        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
	    }

}
