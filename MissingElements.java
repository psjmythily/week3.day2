package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElements {
	
	// Here is the input
	int[] arr = {1,2,3,4,7,6,8};

	// Sort the array	
	

	// loop through the array (start i from arr[0] till the length of the array)

		// check if the iterator variable is not equal to the array values respectively
		
			// print the number
			
			// once printed break the iteration

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input
		Integer[] arr = {1,2,3,4,7,6,8};
		
		//Converting array in to list and sorting
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(arr));
		Collections.sort(a);
		
		//To print missing elements
		for(int i=0; i<a.size()-1; i++)
		{
			if(a.get(i)!=i+1)
			{
			System.out.println(i+1);
			break;
			}
		}

	}

}
