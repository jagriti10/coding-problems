package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxElementOfArray {
	static public List<Integer> maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<Integer>();
        
        res.add(max(Arrays.copyOfRange(nums,0,k)));
       
        
        
        
        
        
        
        return res;
        
    }
	
	
	static int max(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
	
	public static void main(String[] args)
    {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 4;
        int n = arr.length;
        System.out.println(maxSlidingWindow(arr,k));
    }
}
