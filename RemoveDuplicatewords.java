package weekthree.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

public class RemoveDuplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pseudo code 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";
		 *
		 *Output= We learn java basics as part of sessions in week1
		 *
		 * Psuedocode
		 *
		 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
		 * c) Create a empty Set 
		 * d) Iterate the String array
	                 d.1) add each word into Set
		 * e) Print the Set values which is having unique words
		 */
		
		
				String text = "We learn java basics as part of java sessions in java week1";
			String[] input=	text.split(" ");
			Set<String> set1=new LinkedHashSet<String>();
			for(int i=0;i<input.length;i++) {
				set1.add(input[i]);
			}
			List<String>uniquewords=new ArrayList<String>();
			uniquewords.addAll(set1);
			for(int i=0;i<uniquewords.size();i++)
			{
				System.out.println("unique word " + uniquewords.get(i));
			}
				

	}

}
