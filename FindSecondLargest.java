package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	
	// Here is the input
			int[] data = {3,2,11,4,6,7};

			
			/*
			 Pseudo Code:
			 1) Arrange the array in ascending order
			 2) Pick the 2nd element from the last and print it
			 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// input
		Integer[] data = {3,2,11,4,6,7};
		
	    //Converting array in to list and sorting
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(data));
		Collections.sort(a);
		
		//To print second largest value
        System.out.println(a.get(a.size()-2));	
	}

}
