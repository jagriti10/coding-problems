package Maps;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }
	
	public static void main(String[] args) {

		//System.out.println(isAnagram("anagram", "nagaram"));
		int[] arr = {1,2,3,4,5};
		int [] res = findTwoSum(arr, 5);
		for(int i : res) {
		System.out.println(i);
		}
	}
}
