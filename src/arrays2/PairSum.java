package arrays2;

public class PairSum {
	public static int pairSum(int arr[], int sum) {
    	int count = 0;
    	for (int i = 0 ; i<arr.length;i++) {
    		int term1 = arr[i];
    		for (int j = i+1 ; j < arr.length; j++) {
    			int term2 = arr[j];
    			for(int k = j+1; k<arr.length; k++) {
    				int term3 = arr[k];
    				if(term1 + term2 + term3 == sum) {
    				count++;
    			}
    		}
    		}
    	}
    	return count;
    	
    }
	public static void main(String[] args){
		int[] arr = {2, -5, 8, -6, 0, 5, 10, 11, -3};
		int x = 10;
		System.out.println(pairSum(arr, x));
		
	}

}
