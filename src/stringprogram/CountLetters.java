package stringprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a string");
		String input= sc.nextLine();
		
		Map<Character, Integer> lettersCount= countLetters(input);
		System.out.println("letters counts:" + lettersCount);
		
		sc.close();

	}

	private static Map<Character, Integer> countLetters(String input) {
		Map<Character, Integer> letterscounts= new HashMap<>();
		
		for(char c: input.toCharArray()) {
			c= Character.toLowerCase(c);
			letterscounts.put(c, letterscounts.getOrDefault(c, 0)+1);
		}
		return letterscounts;
	}

}
