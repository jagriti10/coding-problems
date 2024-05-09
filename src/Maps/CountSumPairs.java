package Maps;

import java.util.HashMap;
import java.util.Map;

public class CountSumPairs {
	
	public static int countNoOfPairs(int arr[], int n , int k) {
	
		Map<Integer, Integer> map = new HashMap<>();
        int occurence = 0;
        
        for (int i = 0 ; i < n ; i++){
            
            int diff = k - arr[i];
            if(map.containsKey(diff)) {
            	occurence += map.get(diff);
            }
            if(map.containsKey(arr[i])) {
            	map.put(arr[i], map.get(arr[i])+1);
            } else {
            	map.put(arr[i], 1);
            }
        }
        
        return occurence;

	}

	public static void main(String[] args) {
		int arr[] = {1,1,1,2};
		System.out.println(countNoOfPairs(arr,4,3));

	}

}
