package Arrays;

public class Sort012 {

	    public static void sort012(int[] A){
				int start = 0, mid = 0;
	        int pivot = 1;
	        int end = A.length - 1;
	 
	        while (mid <= end)
	        {
	            if (A[mid] < pivot)         // current element is 0
	            {
	                swap(A, start, mid);
	                ++start;
	                ++mid;
	            }
	            else if (A[mid] > pivot)    // current element is 2
	            {
	                swap(A, mid, end);
	                --end;
	            }
	            else {                      // current element is 1
	                ++mid;
	            }
	        }
	    }

	    private static void swap(int[] A, int i, int j)
	    {
	        int temp = A[i];
	        A[i] = A[j];
	        A[j] = temp;
	    }
	    
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
			int arr[] = {0, 1, 2, 0, 1, 2, 0};
			sort012(arr);
			for(int i = 0 ; i < arr.length; i++) {
				System.out.println(arr[i]+" ");
			}
		}
	}
