package SearchingAndSorting;

import java.lang.Math;
public class PairWithSmallestDifference {
	public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i< n; i++) {
			
	    	 for (int j = 0 ; j < m; j++) {
	    		 int diff = Math.abs(arr1[i] - arr2[j]);
	    		 if( diff < min ) {
	    			 min = diff;
	    		 }
	    	 }
	     }   
	     
	     return min;
    }
	
	 public static void main(String[] args){
			int[] arr1 = {1, 5, 12, 3} ;
			int[] arr2 = {16, 9, 10, 20};
			System.out.print(smallestDifferencePair(arr1, arr1.length,  arr2, arr2.length));
	 }
}
