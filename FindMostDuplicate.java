package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMostDuplicate {
	
	/* input: abbaba
	  * output: b
	  * 
	  * 
	  */
		
	 /*
	  * Psuedocode
	  * 
	  * 1) Map -> HashMap 
	  * 2) String -> ch[] -> Get all the character -> occurance
	  * 3) Keep comparing the occurance with other values -> max value -> character
	  * 
	  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input
		String str = "abbaba";
		
		//To Convert it to Character Array
		char[] charArray = str.toCharArray();
		
		//To Get all the character -> occurance
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		//To Keep comparing the occurance with other values and printing the most duplicate
		for(int i=0; i<charArray.length; i++)
		{
			map.put(charArray[i], (map.getOrDefault(charArray[i],0)+1));

			if( map.get(charArray[i])> 1)
			{
				System.out.println( charArray[i]);	
				break;
			}
		}	
	}

}
