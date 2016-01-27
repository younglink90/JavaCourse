public class WordPlay {

	private char[] vowelArray = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

	public boolean isVowel(Character ch) {
		for (char vowel : vowelArray) {
			if (vowel == ch) {
				return true;
			}
		}
		return false;
	}

	public String replaceVowels(String phrase, Character ch) {
		String newString = "";

		for (Character charac : phrase.toCharArray()) {
			if (isVowel(charac)) {
				newString += ch;
			} else {
				newString += charac;
			}
		}

		return newString;
	}

	public String emphasize(String phrase, Character ch) {
		String newString = "";

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == ch) {
				if (i % 2 == 0) { 
					newString += '*'; 
				}
				else {
					newString += '+';
				}
				
				continue;
			}

			newString += phrase.charAt(i);
		}

		return newString;
	}
}
