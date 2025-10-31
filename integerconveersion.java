package whapper;
import java.util.Scanner;

public class integerconveersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        
        Integer objNum = Integer.valueOf(num);

        
        System.out.println("Primitive int value: " + num);
        System.out.println("Integer object value: " + objNum);

        scanner.close();
    }
}
 






