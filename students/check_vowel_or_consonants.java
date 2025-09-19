package students;

import static java.lang.System.out;

import java.util.Scanner;

public class check_vowel_or_consonants {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		out.println("char");
		String a = sc.next();
		switch(a) {
		case ("a"):
			System.out.println("Vowel");
		break;
		case ("e"):
			System.out.println("Vowel");
		break;
		case ("i"):
			System.out.println("Vowel");
		break;
		case ("o"):
			System.out.println("Vowel");
		break;
		case ("u"):
			System.out.println("Vowel");
		break;
		default:
			System.out.println("consonant");

}
	} 
}
