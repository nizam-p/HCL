package prog_challenge;

public class ChallengeTwoPartOne {
	
	
	//Reverse a string without using the String.reverse() method
	public StringBuilder ReverseString(String text) {
		
		StringBuilder result = new StringBuilder();
		String input = text;
		
		for(int i=(input.length()-1); i>=0; i--)
			result.append(input.charAt(i));
		
		return result;
	}
	
	
	//Check whether the input string is Palindrome or not!
	public Boolean IsPalindrome(String text) {

		Boolean result = false;
		String input = text.toLowerCase();
		
		String sample = ReverseString(input).toString();
		result = sample.equals(input) ? true : false ;
		
		return result;
	}
	
	//Main method
	public static void main(String[] args) {
		ChallengeTwoPartOne test = new ChallengeTwoPartOne();
		
		System.out.println(test.ReverseString("skrow esreveR"));
		System.out.println(test.IsPalindrome("Malayalam"));
	}
	

}
