package weekthree.day2;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			int[] data = {3,2,11,4,6,7,2,3,3,6,7};
			//       output= 7;

			/*
			 * Pseudo Code: 
			 * a) Create a empty Set Using TreeSet
			 * b) Declare for loop iterator from 0 to data.length and add into Set 
			 * c) converted Set into List
			 * d) Print the second last element from List
			 * 
			 * 
			 */
	
            Set<Integer> d1=new TreeSet<Integer>();
            for(int i=0;i<data.length;i++) {
            	d1.add(data[i]);
            	
            }
            System.out.println("data"+d1);
            List<Integer> sl=new ArrayList<Integer>();
            sl.addAll(d1);
            System.out.println("SECOND LARGEST"  +sl.get(sl.size()-2));

	}

}
