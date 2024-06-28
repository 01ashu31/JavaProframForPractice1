package practicejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateStringcount {
	public static void duplicateChar(String word) {
		boolean flag = true;
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] charArray = word.toCharArray();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				flag = false;
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		if (flag == true) {
			System.out.println("no duplicate");
		}
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String obj1 = obj.next();
		duplicateChar(obj1);

	}
}

