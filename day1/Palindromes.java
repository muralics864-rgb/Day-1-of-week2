package week1.day1;

public class Palindromes {

	public static void main(String[] args) {
		
		int input = 1234;
		int reversed =0;
		int original = input;
		
		while(input !=0)
		{
			int digit = input %10;
			reversed = reversed * 10 + digit;
			input = input/10;			
		}
		
		if(original==reversed)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
			
	}

}
