package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		
		//To split each words in string
		String[] split = text.split(" ");
		
		//Using Set 
		Set<String> value = new LinkedHashSet<String>();
		
		//Adding items to set( Set by default remove duplicate values)
		for(int i =0; i< split.length;i++)
		{
			value.add(split[i]);
		}
		
		//To print items in Set
		for(String string : value)
			System.out.print(string + " ");
		
		}
	
	}

