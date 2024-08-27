package array;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 1, 6, 2, 5 };
		int[] uniqueArray = removeDuplicates(array);
		System.out.println("Array with duplicates removed:");
		for (int num : uniqueArray) {
			System.out.print(num + " ");
		}
	}

	public static int[] removeDuplicates(int[] array) {
		Set<Integer> set = new HashSet<>();
		for (int num : array) {
			set.add(num);
		}
		int[] result = new int[set.size()];
		int i = 0;
		for (int num : set) {
			result[i++] = num;
		}
		return result;
	}

}

//from ArrayList

//	public static void main(String[] args) {
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		arrayList.add(5);
//		arrayList.add(2);
//		arrayList.add(9);
//		arrayList.add(1);
//		arrayList.add(6);
//		arrayList.add(2);
//		arrayList.add(5);
//		ArrayList<Integer> uniqueList = removeDuplicates(arrayList);
//		System.out.println("ArrayList with duplicates removed:");
//		for (int num : uniqueList) {
//			System.out.print(num + " ");
//		}
//	}
//
//public static ArrayList<Integer>
//removeDuplicates(ArrayList<Integer> list) {
//Set<Integer> set = new HashSet<>(list);
//return new ArrayList<>(set);
//}