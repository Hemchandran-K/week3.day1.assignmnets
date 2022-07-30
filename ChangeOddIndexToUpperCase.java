package week3.day1.assignments;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {

		// * Declare String Input as Follow

		// * String test = "changeme";

		// * a) Convert the String to character array

		// * b) Traverse through each character (using loop)

		// * c)find the odd index within the loop (use mod operator)

		// * d)within the loop, change the character to uppercase, if the index is odd
		// else don't change

		String test = "changeme";
		// Convert the String to character array
		char[] good = test.toCharArray();

		// find the odd index within the loop (use mod operator)

		for (int i = 0; i < test.length(); i++) {
			if (i % 2 == 0)

				System.out.print(test.substring(i, i + 1).toUpperCase());
			else
				System.out.print(test.substring(i, i + 1).toLowerCase());

		}

	}
}
