package Maps;

import java.util.HashMap;
import java.util.Map;

/*
Given an integer array nums, return true if 
any value appears at least twice in the array, 
and return false if every element is distinct.
*/
public class ContainsDuplicate {

	public static boolean checkDuplicate(int[] arr) {
		
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i : arr) {
			if(map.containsKey(i)) {
				return true;
			} else {
				map.put(i, 1);
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		System.out.println(checkDuplicate(arr));

	}

}
