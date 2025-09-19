package Stringlevel1;
import java.util.*;
public class Q5 {
	 public static void generateException(String text) {
	        // Accessing index beyond length
	        System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
	    }

	    // Method to handle StringIndexOutOfBoundsException
	    public static void handleException(String text) {
	        try {
	            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Handled StringIndexOutOfBoundsException! Invalid index access.");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        System.out.println("\nCalling method that generates exception:");
	        try {
	            generateException(input);
	        } catch (Exception e) {
	            System.out.println("Exception occurred: " + e);
	        }

	        System.out.println("\nCalling method that handles exception:");
	        handleException(input);

	        sc.close();
	    }
	

}
