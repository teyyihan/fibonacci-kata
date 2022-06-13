import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

	private final RomanNumeral romanNumeral = new RomanNumeral();

	@Test
	void doSomething() {
		Assertions.assertEquals("I", romanNumeral.convert(1));
		Assertions.assertEquals("II", romanNumeral.convert(2));
		Assertions.assertEquals("IV", romanNumeral.convert(4));
		Assertions.assertEquals("V", romanNumeral.convert(5));
		Assertions.assertEquals("VI", romanNumeral.convert(6));
		Assertions.assertEquals("VIII", romanNumeral.convert(8));
		Assertions.assertEquals("IX", romanNumeral.convert(9));
		Assertions.assertEquals("X", romanNumeral.convert(10));
		Assertions.assertEquals("XI", romanNumeral.convert(11));
		Assertions.assertEquals("XII", romanNumeral.convert(12));
		Assertions.assertEquals("XXX", romanNumeral.convert(30));
		Assertions.assertEquals("XXXIII", romanNumeral.convert(33));
		Assertions.assertEquals("XXXIV", romanNumeral.convert(34));
		Assertions.assertEquals("XL", romanNumeral.convert(40));
		Assertions.assertEquals("LXXX", romanNumeral.convert(80));
		Assertions.assertEquals("XC", romanNumeral.convert(90));
		Assertions.assertEquals("LXXXVIII", romanNumeral.convert(88));
	}

}
