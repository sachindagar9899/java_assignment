package arraypractice;

import java.util.Scanner;

public class simplearray1 {
	public static void main(String[] arg) {
		   Scanner sc = new Scanner(System.in);

	        // Define an array of 10 integer elements
	        int[] ages = new int[10];

	        // Take user input for 10 students' ages
	        System.out.println("Enter the ages of 10 students: ");
	        for (int i = 0; i < ages.length; i++) {
	            System.out.print("Enter age of student " + (i + 1) + ": ");
	            ages[i] = sc.nextInt();
	        }

	        // Check voting eligibility
	        System.out.println("\nVoting Eligibility Results:");
	        for (int i = 0; i < ages.length; i++) {
	            int age = ages[i];
	            if (age < 18 ) {
	                System.out.println("Student " + (i + 1) + ": not eligible to vote");
	            } else  {
	                System.out.println("Student " + (i + 1) + " with age " + age + " can vote.");
	     
	     
	    
       

	}
}
	}

}
