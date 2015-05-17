package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {

	@Test
	public void testWordScrambler() {
		assertEquals("tnihg", Scrambler.scrambleWord("thing"));
		assertEquals("wlohe", Scrambler.scrambleWord("whole"));
		assertEquals("inatropmt", Scrambler.scrambleWord("important"));
		assertEquals("pelborm", Scrambler.scrambleWord("problem"));
	}
	
	@Test
	public void testTextScrambler() {
		String textToScramble = "According to a researcher at Cambridge University, it doesn't matter in what order the letters in a word are, the only important thing is that the first and last letter be at the right place.";
		String expectedResult = "Anidroccg to a rehcraeser at Cgdirbmae Utisreviny, it d'nseot mettar in waht oedrr the lrettes in a wrod are, the olny inatropmt tnihg is taht the fsrit and lsat letter be at the rhgit pcale.";
		assertEquals(expectedResult, Scrambler.scrambleText(textToScramble));
	}
}
