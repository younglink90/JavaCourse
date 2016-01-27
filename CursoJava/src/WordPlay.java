public class WordPlay {

	public boolean isVowel(Character ch) {
		return "aeiouAEIOU".contains(ch.toString());
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
