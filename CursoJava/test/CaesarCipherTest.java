import org.junit.Test;

import static junit.framework.Assert.*;

public class CaesarCipherTest {

	@Test
	public void testEncrypt() {
		CaesarCipher cc = new CaesarCipher();
		String firstStringToCipher = "FIRST LEGION ATTACK EAST FLANK!";
		String firstStringCiphered = "CFOPQ IBDFLK XQQXZH BXPQ CIXKH!";
		String firstResult = cc.encrypt(firstStringToCipher, 23);
		
		String secondStringToCipher = "First Legion"; 
		String secondStringCiphered = "Wzijk Cvxzfe";
		String secondResult = cc.encrypt(secondStringToCipher, 17);
		
		assertTrue(firstResult.equals(firstStringCiphered));
		assertTrue(secondResult.equals(secondStringCiphered));
	}
	
	@Test
	public void testEncryptTwoKeys() {
		CaesarCipher cc = new CaesarCipher();
		String StringToCipher = "First Legion";
		String ExpectedStringCiphered = "Czojq Ivdzle";
		
		String Result = cc.encryptTwoKeys(StringToCipher, 23, 17);
				 		
		assertTrue(Result.equals(ExpectedStringCiphered));
	}
}