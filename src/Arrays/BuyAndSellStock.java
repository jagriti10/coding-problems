package Arrays;

public class BuyAndSellStock {
	
	public static int maxProfit(int[] arr) {
		int maxDiff = 0;
		
		for(int i = 0 ; i< arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int diff = arr[j] - arr[i];
				if (diff > maxDiff) {
					maxDiff = diff;
				}
			}
		}
		
		return maxDiff;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,6,4,3,1};
		System.out.println(maxProfit(arr));
	}

}
