package main;

public class Scrambler {
	
	public static String scrambleText(String text){
		//split the sentence by comma, dot and white spaces
		String[] words = text.split("(?=[,.])|\\s+");
		String result = "";
		
		for (int i = 0; i < words.length; i++) {
			words[i] = scrambleWord(words[i]);
		}
		
		for (int i = 0; i < words.length; i++) {
			
			//add space before a dash
			if (words[i].equals("-")) {
				result += " ";
			}
			
			result += words[i];
		
			//add space if next word is not a special character
			if (i + 1 < words.length && !words[i+1].matches("[^a-zA-Z0-9 ]")) {
				result += " ";
			}
		}
		return result;
	}
	
	public static String scrambleWord(String word){
		char[] characters = word.toCharArray();
		
		for (int i = 1; i < characters.length - i; i++) {
			char temp = characters[i];
			characters[i] = characters[characters.length - i - 1];
			characters[characters.length - i - 1] = temp;
		}
		return new String(characters);
	}
}
