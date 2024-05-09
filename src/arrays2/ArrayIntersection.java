package arrays2;

import java.util.Arrays;

public class ArrayIntersection {
	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here

		int len1 = arr1.length ;
		int len2 = arr2.length;
		int[] intersect = new int[len1+len2];

		// if (len1<= len2){
		// 	intersect = new int[len1] ;
		// } else {
		// 	intersect = new int[len2] ;
		// }

		int index = 0;
		for (int i = 0 ; i < len1; i++){
			if(arr1[i] != arr1[i+1]){
				for (int j = 0 ; j < len2; j++){
					if(arr1[i] == arr2[j]){
						intersect[index] = arr2[j];
						index++;
						break;
					}
				}
			}
		}

		Arrays.sort(intersect);
		for(int k = 0; k < intersect.length ; k++){
			if(intersect[k] != 0){
			System.out.print(intersect[k]+" ");
			}
		}
	}
	
	 public static void main(String[] args){
	            int[] arr1 = {11, 11, 12, 12, 13};
	            int[] arr2 = {11, 12, 12, 13, 13};
	            intersection(arr1, arr2);

	        }
}
