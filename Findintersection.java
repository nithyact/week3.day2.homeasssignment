package weekthree.day2;
import java.util.List;
import java.util.ArrayList;

public class Findintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /* Pseudo Code
		 *input: int[] a={3,2,11,4,6,7};
		 *        int[] b={1,2,8,4,9,7};
		 *output:2,4,7
		 *
		 * a) Declare An Array for {3,2,11,4,6,7};	 
		 * b) Declare another Array for {1,2,8,4,9,7};
		 * c) create a two empty Lists - list1 & list2
		 * c) Declare for loop iterator from 0 to array a.length and add into list1
		 * d) Declare for loop iterator from 0 to array b.length and add into another list2
		 * e) Compare Both list1 & list2 using a nested for loop
		 *    1)Print the matching number
		 *  
		 */
        int[] a= {3,2,11,4,6,7};
        int[] b= {1,2,8,4,9,7};
        List<Integer> input1 =new ArrayList<Integer>();
        List<Integer> input2 =new ArrayList<Integer>();
        for(int i=0;i<a.length;i++) {
        	input1.add(a[i]);
        }
        for(int i=0;i<b.length;i++)
        {
        	input2.add(b[i]);
        }
        for(int i=0;i<input1.size();i++) {
        	for(int j=0;j<input2.size();j++) {
        		if(input1.get(i)== input2.get(j)) {
        			System.out.println("Matching number" + input1.get(i));
        			
        		}
        	}
        }
	}

}
