package Stringlevel1;
import java.util.*;
import java.lang.*;
public class Q4 {
	 public static void generateException() {
	        String text = null;
	        System.out.println(text.length());
	    }

	    public static void handleException() {
	        String text = null;
	        try {
	            System.out.println(text.length());
	        } catch (NullPointerException e) {
	            System.out.println("Handled NullPointerException");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            generateException();
	        } catch (Exception e) {
	            System.out.println("Exception occurred: " + e);
	        }
	        handleException();
	    }
	}