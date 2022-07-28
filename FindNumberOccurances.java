package week3.day2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindNumberOccurances {
	/*
	  * Input array numbers, each occurances
	  * 
	  * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
	  * output: 2 -> 3 , 3 -> 2, 4 -> 1 
	  * 
	  * Order: Ascending Order
	  * 
	  */
		
	 /*
	  * Psuedcode:
	  * 
	  * 1) Create Map -> TreeMap
	  * 2) For loop -> each number -> add to the map
	  * 3) If it is exist -> update it with + 1
	  * Else -> new entry with 1 as value
	  * 
	  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Input
		Integer[] nums ={2,3,5,6,3,2,1,4,2,1,6,-1};
		
		//Using Map
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        
		//To print each occurances
		for(int i=0; i<nums.length; i++)
		{
			map.put(nums[i], (map.getOrDefault(nums[i],0)+1));
		}
				System.out.println( map.entrySet());

	}

}
