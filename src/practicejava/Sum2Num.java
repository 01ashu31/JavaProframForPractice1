package practicejava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sum2Num {

		public static int[] twoSum(int[] numbers, int target) {
	        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
	        for(int i = 0; i < numbers.length; i++){
	            Integer requiredNum = (Integer)(target - numbers[i]);
	            if(indexMap.containsKey(requiredNum)){
	                int toReturn[] = {indexMap.get(requiredNum), i};
	                return toReturn;
	            }

	            indexMap.put(numbers[i], i);
	        }
	        return null;
	    }
		
		public static void main(String a[]) {
			int[] i= {3,4,8,9,5,6,7};
			System.out.println(Arrays.toString(twoSum(i, 10)));
		}
	}


