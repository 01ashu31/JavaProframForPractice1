package stringprogram;

public class StringWithSpecialReverseString {

	public static void main(String[] args) {
		String inputString="As#to%ash@hghj";
		char[] chararray=inputString.toCharArray();
		
		int left=0;
		int right =inputString.length()-1;
		
		while(left < right){
		    if(!Character.isLetter(chararray[left])){
		        left ++;
		    }
		    else if (!Character.isLetter(chararray[right])){
		    right--;
		    }
		    else{
		        char temp= chararray[left];
		        chararray[left]=chararray[right];
		        chararray[right]=temp;
		        left ++;
		        right--;
		    }
		}
		System.out.print(chararray);

	}

	}

}

//output: jh#gh%hsa@otsA
