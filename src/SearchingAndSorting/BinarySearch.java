package SearchingAndSorting;

public class BinarySearch {
	 public static int binarySearch(int[] arr, int x) {
	    	//Your code goes here
		 int start = 0;
		 int end = arr.length -1 ;
		 while(start <= end) {
			 int mid = (start + (end-1)) / 2;
			 
			 if(arr[mid] == x) {
				 return mid;
			 }
			 
			 if(arr[mid] < x) {
				 start = mid +1;
			 } else {
				 end = mid - 1; 
			 }
		 }
		 return -1;
	    }
	 public static void main(String[] args){
			int[] arr = {1 ,2 ,3 ,4 ,5 ,6 ,7};
			int x = 9;
			System.out.println(binarySearch(arr, x));
			
		}
}
