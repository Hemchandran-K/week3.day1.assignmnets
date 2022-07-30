package week3.day1.assignments;

import java.util.Arrays;

public class MissingElement {

	// loop through the array (start i from arr[0] till the length of the array)

	// check if the iterator variable is not equal to the array values respectively

	// print the number

	// once printed break the iteration

	public static void main(String[] args) {
		// enter the input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);//

		{
			for (int j = 1; j < arr.length; j++) {

				if (j != arr[j - 1]) {
					System.out.print("the missing number is  " + j);
					break;

				}
			}
		}
	}
}
