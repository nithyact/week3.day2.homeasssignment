package weekthree.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		/*Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */
		
		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */

		 int[] data= {2,3,4,5,1,7,9,8,10,3,2,4};
		  Set<Integer> d1=new TreeSet<Integer>();
          for(int i=0;i<data.length;i++) {
          	d1.add(data[i]);
          	
          }
          System.out.println("data"+d1);
          List<Integer> sl=new ArrayList<Integer>();
          sl.addAll(d1);
          for (int i=0;i<sl.size();i++)
          {
        	  int currentvalue=sl.get(i);
        	  int nextpossiblevalue=currentvalue+1;
        	  int nextvalue=sl.get(i+1);
        	  if(nextvalue != nextpossiblevalue) {
        		  System.out.println("missing number"+nextpossiblevalue);
        		break;  
        	  }
          }
	}

}

