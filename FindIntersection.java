package week3.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class FindIntersection {
	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (should match item in both arrays)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare An array for {3,2,11,4,6,7};	
		Integer[] array1 = {3,2,11,4,6,7};	
		
		//Declare another array for {1,2,8,4,9,7};
		Integer[] array2 = {1,2,8,4,9,7};
        
		//Converting array1 in to list and sorting
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(array1));
		Collections.sort(a);
		
		//Converting array2 in to list and sorting
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(array2));
		Collections.sort(b);
		
		//To print common value
		for(int i=0; i< a.size()-1 ; i++)
		{
			for(int j=0;j<b.size()-1; j++)
			{
				if(a.get(i) == b.get(j))
					System.out.println(a.get(i));
			}
		}

	}

}
