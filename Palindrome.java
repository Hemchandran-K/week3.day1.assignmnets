package week3.day1.assignments;

public class Palindrome {
//  Declare A String value as"madam"
	// Declare another String rev value as ""
	// Iterate over the String in reverse order
	// Add the char into rev
	// Compare the original String with the reversed String, if it is same then
	// print palinDrome
	// Hint: Use .equals or .equalsIgnoreCase when you compare a String

	public static void main(String[] args) {
		String original = "madam";// string name
		int g = original.length();
		String rev = "";// another string name
		//
		for (int i = original.length() - 1; i >= 0; i--) {
			rev = rev + original.charAt(i);
		}
		System.out.println(rev);
		if (original.equals(original)) {
			System.out.println(" is a palindrome");
		} else {
			System.out.println(" is not a palindrome");

		}

	}

}
