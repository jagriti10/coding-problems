package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerWithMostWater {
		
	static int maxArea(int nums[]) {
		
		int length = nums.length;
		
		List<Integer> area = new ArrayList<Integer>();
		int low=0,high= length-1;
		while(low<high) {
			int distance = high-low;
			if (nums[low]<=nums[high]) {
				area.add(nums[low]* distance);
				low++;
			} else {
				area.add(nums[high] * distance);
				high--;
			}
		}
			Collections.sort(area);
			return area.get(area.size()-1);
	}
	
	public static void main(String args[]) {
			int water[] = {2,3,4,5,18,17,6};
			int maxArea = maxArea(water);
			System.out.println(maxArea);
		}
}
