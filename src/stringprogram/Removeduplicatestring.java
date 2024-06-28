package stringprogram;

public class Removeduplicatestring {

	public static void main(String[] args) {
		String input="testing";
		String result=removeRepeated(input);
		System.out.println("Original string : " + input);
		System.out.println("result : " + result);

	}
	public static String removeRepeated(String str) {
		StringBuilder result= new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			char currentChar= str.charAt(i);
			
			if(result.indexOf(String.valueOf(currentChar))== -1) {
				result.append(currentChar);
			}
		}
		
		return result.toString();
	}

}
