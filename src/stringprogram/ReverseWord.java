package stringprogram;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a sentense");
		String sentense= sc.nextLine();
		System.out.println("Reversed a word in the sentence: " + revWord(sentense));

	}

	private static String revWord(String sentence) {
		String[] words= sentence.split("\\s+");
		StringBuilder res= new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			res.append(words[i]).append(" ");
		}
		return res.toString().trim();
	}

}
