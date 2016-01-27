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
		
		String firstExpectedResult = "Hplp";
		String secondExpectedResult = "Hplp, cpmp pndpmpps, cpmppñprp";
		
		String firstTest = wp.replaceVowels("Hola", 'p');
		String secondTest = wp.replaceVowels("Hola, como andamios, compañero", 'p');
		
		assertTrue(firstExpectedResult.equals(firstTest));
		assertTrue(secondExpectedResult.equals(secondTest));
	}
	
	@Test
	public void testEmphasize() {
		WordPlay wp = new WordPlay();
		
		String expectedResult = "dn* ctg+*+ctg+";
		
		String result = wp.emphasize("dna ctgaaactga", 'a');
		assertTrue(expectedResult.equals(result));
	}
}
