package SearchingAndSorting;

import java.util.Arrays;

public class SelectionSort {
    
	public static void selectionSort(int[] arr) {
		Arrays.sort(arr);
		for(int i = 0 ; i<arr.length ; i++) {
			int min = arr[i];
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[j] <  min) {
					min = arr[j];
				}
			}
			
			 int temp = min;
	           min = arr[i];
	           arr[i] = temp;
		}
		
		for(int i = 0; i< arr.length ; ++i)
        System.out.print(arr[i]+" ");
    }  

	public static void main(String[] args){
		int[] arr = {1,3,0,4,2,7,6};
		selectionSort(arr);
	}
}
