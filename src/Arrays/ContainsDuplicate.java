package Arrays;

import java.util.Arrays;

public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] arr) {
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length ; i = i+2) {
			if(arr[i] == arr[i+1]) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,1};
		System.out.print(containsDuplicate(arr));
	}

}
