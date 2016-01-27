/*
 * Write a method isVowel that has one Char parameter named ch. 
 * This method returns true if ch is a vowel (one of 'a', 'e', 'i', 'o', or 'u' or the uppercase versions) and false otherwise. 
 * You should write a tester method to see if this method works correctly. For example, isVowel(‘F’) should return false, and isVowel(‘a’) should return true.
 * 
Write a method replaceVowels that has two parameters, a String named phrase and a Char named ch. 
This method should return a String that is the string phrase with all the vowels (uppercase or lowercase) replaced by ch. 
For example, the call replaceVowels(“Hello World”, ‘*’) returns the string “H*ll* W*rld”. 
Be sure to call the method isVowel that you wrote and also test this method.

Write a method emphasize with two parameters, a String named phrase and a character named ch. 
This method should return a String that is the string phrase but with the Char ch (upper- or lowercase) replaced by
‘*’ if it is in an odd number location in the string (first character has index 0, third character has index 2, etc.), or

‘+’ if it is in an even number location in the string (second character has index 1, fourth character has index 3, etc.).

For example, the call emphasize(“dna ctgaaactga”, ‘a’) would return the string “dn* ctg+*+ctg+”, and the call emphasize(“Mary Bella Abracadabra”, ‘a’) would return the string “M+ry Bell+ +br*c*d*br+”. Be sure to test this method.
 * 
 */
public class WordPlay {

	private char[] vowelArray = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

	public boolean isVowel(Character ch) {
		for(char vowel : vowelArray) {
			if(vowel == ch) {
				return true;
			}
		}
		return false;
	}
	
	public String replaceVowels(String phrase, Character ch) {
		String newString = "";
		
		for (Integer i = 0; i < phrase.length(); i++) {
			if(isVowel(phrase.charAt(i))){
				newString += ch;
			} else{
				newString += phrase.charAt(i);
			}
		}
		
		return newString;
	}
	
	public String emphasize(String phrase, Character ch) {
		String newString = "";
		
		return "";
	}
}
