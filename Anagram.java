package week3.day1.assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// *Declare a String
		// String text1 = "stops";
		// *Declare another String
		// String text2 = "potss";
		// * a) Check length of the strings are same then (Use A Condition)
		// * b) Convert both Strings in to characters
		// * c) Sort Both the arrays
		// * d) Check both the arrays has same value
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length()) {
			System.out.println("both are same");
		} else {
			char[] array1 = text1.toCharArray();
			char[] array2 = text2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);

			if (Arrays.equals(array1, array2)) {
				System.out.println("anagram");
			} else {
				System.out.println("not a anagram");
			}

		}
	}

}
