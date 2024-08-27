package stringprogram;

import java.util.*;
import java.lang.*;
import java.io.*;

public class CountWords {
	
	 public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter you string");
	        String input = sc.nextLine();
	        int wordcount=findDuplicate(input);
	        System.out.println(wordcount);

	        // 		findDuplicate("Java Programming leaning");
	    }
	    public static int findDuplicate(String word) {
	       
	      word=word.trim();
	      if(word.isEmpty()){
	          return 0;
	      }
	      
	      int count =1;
	      
	      for (int i=0; i<word.length()-1;i++){
	          if((word.charAt(i) ==' ') && (word.charAt(i+1)!=' ')){
	              count ++;
	          }
	      }
	      return count;
	    //   String[] count=word.split("\\s+");
	    //   return count.length;
	      
	      
	    }

}
