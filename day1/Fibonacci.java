package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int fibTill = 10;
		System.out.print(a + "," + b);  // first printing the 0 & 1 outside of the loop
		for (int i = 2; i <= fibTill; i++) {

			int next = a + b; // storing the sum of a+b value to next
			System.out.print("," + next); // printing the sum value
			a = b; // now shifting b number to a
			b = next; // & Total number to b.
		}

	}
}
