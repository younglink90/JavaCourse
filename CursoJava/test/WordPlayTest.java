import org.junit.Test;

import static org.junit.Assert.*;


public class WordPlayTest {

	@Test
	public void testIsVowelMethod() {
		WordPlay wp = new WordPlay();
		assertFalse(wp.isVowel('f'));
		assertTrue(wp.isVowel('a'));
	}
	
	@Test
	public void testReplaceVowel() {
		WordPlay wp = new WordPlay();
		String firstTest = wp.replaceVowels("Hola", 'p');
		String secondTest = wp.replaceVowels("Hola, como andamios, compañero", 'p');
		assertTrue("Hplp".equals(firstTest));
		assertTrue("Hplp, cpmp pndpmpps, cpmppñprp".equals(secondTest));
	}
}
