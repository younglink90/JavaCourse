
public class CaesarCipher {

	private static final int FIRST_UPPERCASE_LETTER_POSITION = 65;
	private static final int LAST_UPPERCASE_LETTER_POSITION = 90;
	private static final int FIRST_LOWERCASE_LETTER_POSITION = 97;
	private static final int LAST_LOWERCASE_LETTER_POSITION = 122;

	public String encrypt(String phrase, int key) {
		String cipheredMessage = "";

		int keyParsed = key % 26;

		for (char charac : phrase.toCharArray()) {
			if ((charac >= FIRST_UPPERCASE_LETTER_POSITION && charac <= LAST_UPPERCASE_LETTER_POSITION)) {
				cipheredMessage += shiftCharacter(charac, FIRST_UPPERCASE_LETTER_POSITION, keyParsed);
				continue;
			}
			if ((charac >= FIRST_LOWERCASE_LETTER_POSITION && charac <= LAST_LOWERCASE_LETTER_POSITION)) {
				cipheredMessage += shiftCharacter(charac, FIRST_LOWERCASE_LETTER_POSITION, keyParsed);
				continue;
			}
			cipheredMessage += charac;
		}

		return cipheredMessage;
	}

	public String encryptTwoKeys(String input, int Key1, int Key2) {
		String cipheredMessage = "";

		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 0)
				cipheredMessage += encrypt(input.substring(i, i + 1), Key1);
			else
				cipheredMessage += encrypt(input.substring(i, i + 1), Key2);
		}

		return cipheredMessage;
	}

	private char shiftCharacter(char ch, int firstLetter, int key) {
		int charResult = ch - firstLetter;
		int shiftPositions = (charResult + key) % 26;
		return (char) (firstLetter + shiftPositions);
	}
}
