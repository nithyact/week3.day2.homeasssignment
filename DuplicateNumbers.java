package weekthree.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {4,3,6,8,29,1,2,4,7,8};

		
		/* * Problem Statement : Print only duplicate values
		 * Expected output: 4 and 8
		 * 
		 * How to solve?
		 * 1) Regular for loop
		 * 2) Using Set
		 * 
		 * Using Set 
		 * 
		 * a) Add every element into Set
		 * b) If it is already there in the Set -> Print duplicate
		 * 
		 */

		Set<Integer>  data1=new HashSet<Integer>();
		 for(int i=0;i<data.length;i++)
		 {
	        if(data1.contains(data[i])) {
	        	System.out.println("duplicate number" +data[i]);
	        }
			 data1.add(data[i]);
	        
		 }
	}
	
}

	          	

