package practicejava;

import java.util.Scanner;

public class StringVowelConstant {

public String vowels(String character) {
		if (character!=null && character.length()==1){
		   if(character.equalsIgnoreCase("a")||character.equalsIgnoreCase("e")|| character.equalsIgnoreCase("i")||character.equalsIgnoreCase("o")||character.equalsIgnoreCase("u")) {
		     return "vowels";
		    }else
		      return "consonent";
		    }
		return null;
}

public static void main(String[] args) throws Exception {
	try {
		Scanner sc= new Scanner(System.in);
		StringVowelConstant stringVowelConstant= new StringVowelConstant();
		String s1= stringVowelConstant.vowels(sc.next().toString());
		System.out.println(s1);
	}catch(Exception e) {
		e.printStackTrace();
	} 
}
}