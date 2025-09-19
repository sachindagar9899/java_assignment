package Stringlevel1;
import java.util.*;
import java.lang.*;
public class Q3 {
	    public static char[] customToCharArray(String str) {
	        char[] result = new char[str.length()];
	        for (int i = 0; i < str.length(); i++) {
	            result[i] = str.charAt(i);
	        }
	        return result;
	    }

	    // Method to compare two char arrays
	    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
	        if (arr1.length != arr2.length) {
	            return false;
	        }
	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] != arr2[i]) {
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

	        // Custom method
	        char[] customArray = customToCharArray(text);

	        // Built-in method
	        char[] builtInArray = text.toCharArray();

	        // Compare arrays
	        boolean isSame = compareCharArrays(customArray, builtInArray);

	        // Display results
	        System.out.print("\nCustom char array: ");
	        for (char c : customArray) {
	            System.out.print(c + " ");
	        }

	        System.out.print("\nBuilt-in char array: ");
	        for (char c : builtInArray) {
	            System.out.print(c + " ");
	        }

	        System.out.println("\nAre both arrays equal? " + isSame);

	        sc.close();
	    }
	
	    
	

}
