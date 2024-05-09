package arrays2;

import java.io.IOException;

public class SwapAlternate {
	public static void swapAlternate(int arr[]) {
    	//Your code goes here
		int ele = arr.length;
		int position = 0, temp;
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i]== ele) {
				position = i;
				break;	
			}
		}
		if (position != arr.length - 1) {
			temp = arr[position];
			arr[position] = arr[position+1];
			arr[position+1] = temp;
		} else {
			temp = arr[position];
			arr[position] = arr[position-1];
			arr[position-1] = temp;
		}
		for (int element: arr) {
            System.out.print(element+ " ");
        }
		System.out.println();
		
    }
	public static void main(String[] args){
		
		int[] arr1 = {4, 3, 6, 12, 4, 32};
		int[] arr2 = {1 ,2 ,3 ,4 ,5 ,6};
		//swapAlternate(arr1);
		swapAlternate(arr2);
}
}
