package stringprogram;

public class CommonPrePix {

	public static void main(String[] args) {
		String[] arr = { "armstrong", "armor", "archer" };
		System.out.println("Common Prefix: " + findCommonPrefix(arr));
	}

	public static String findCommonPrefix(String[] arr) {
		if (arr == null || arr.length == 0)
			return "";
		if (arr.length == 1)
			return arr[0];

		// Find the minimum length string in the array
		int minLength = arr[0].length();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() < minLength) {
				minLength = arr[i].length();
			}
		}

		// Use the minimum length string as the basis for comparison
		StringBuilder commonPrefix = new StringBuilder();
		for (int i = 0; i < minLength; i++) {
			char currentChar = arr[0].charAt(i);
			for (int j = 1; j < arr.length; j++) {
				if (arr[j].charAt(i) != currentChar) {
					return commonPrefix.toString();
				}
			}
			commonPrefix.append(currentChar);
		}
		return commonPrefix.toString();
	}

}
