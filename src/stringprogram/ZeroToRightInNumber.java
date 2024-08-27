package stringprogram;

public class ZeroToRightInNumber {
	public static void main(String[] args) {
		String input = "32400121200";
		String output = rearrangeDigits(input);
		System.out.println("Output: " + output);
	}

	public static String rearrangeDigits(String input) {
		// Split the input into parts: digits and non-digits
		StringBuilder digits = new StringBuilder();
		StringBuilder nonDigits = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				digits.append(c);
			} else {
				nonDigits.append(c);
			}
		}
		// Concatenate non-digits followed by digits
		return digits.toString() + nonDigits.toString();
	}

}



//public static String transformString(String str) {
//    StringBuilder zeros = new StringBuilder();
//    StringBuilder nonZeros = new StringBuilder();
//    
//    // Iterate through the string
//    for (char ch : str.toCharArray()) {
//        if (ch == '0') {
//            zeros.append(ch);  // Append zero to the zeros StringBuilder
//        } else {
//            nonZeros.append(ch);  // Append non-zero character to the nonZeros StringBuilder
//        }
//    }
//    
//    // Concatenate zeros followed by non-zero characters
//    return zeros.toString() + nonZeros.toString();
//}
