package arrays2;

import java.io.IOException;

public class linearSearch {
	public static int linearSearchOfX(int arr[], int x) {
		for (int i = 0 ; i < arr.length; i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		 return -1;
    }
	
    public static void main(String[] args) throws NumberFormatException, IOException {
            int[] input = {2, 13, 4, 1, 3, 6, 28};
            int val = 3;
            System.out.println(linearSearchOfX(input, val));
    }
}
