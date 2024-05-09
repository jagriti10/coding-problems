package SearchingAndSorting;

public class CountSmall {
	
	 public static int[] countS(int n, int m, int []a, int []b) {
		 int[] count = new int[n];
	     for(int i = 0; i< n; i++) {
	    	 for (int j = 0 ; j < m; j++) {
	    		 if(b[j] <= a[i]) {
	    			 count[i]++;
	    		 }
	    	 }
	     }   
	     
	     return count;
		 
	    }
	 
	 public static void main(String[] args){
			int[] arr1 = {4, 5, 6, 7} ;
			int[] arr2 = {6,7};
			int[] ans = countS(arr1.length, arr2.length, arr1, arr2);
			for (int i = 0; i < ans.length; i++) {
	            System.out.print(ans[i] + " ");
			}
	 }
}
