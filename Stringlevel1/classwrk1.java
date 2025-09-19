package Stringlevel1;
import java.util.*;

public class classwrk1 {
	 public static String customSubstring(String str, int start, int end) {
	        String result = "";
	        for (int i = start; i < end; i++) {
	            result += str.charAt(i);
	        }
	        return result;
	    }

	    // Method to compare two strings using charAt()
	    public static boolean compareStrings(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        for (int i = 0; i < str1.length(); i++) {
	            if (str1.charAt(i) != str2.charAt(i)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking input
	        System.out.print("Enter a string: ");
	        String text = sc.nextLine();

	        System.out.print("Enter start index: ");
	        int start = sc.nextInt();

	        System.out.print("Enter end index: ");
	        int end = sc.nextInt();

	        // Create substring using charAt()
	        String customSub = customSubstring(text, start, end);

	        // Create substring using built-in substring()
	        String builtInSub = text.substring(start, end);

	        // Compare using charAt()
	        boolean isSame = compareStrings(customSub, builtInSub);

	        // Display results
	        System.out.println("\nCustom substring (using charAt): " + customSub);
	        System.out.println("Built-in substring: " + builtInSub);
	        System.out.println("Are both substrings equal? " + isSame);

	        sc.close();
	    	}

		
	}

