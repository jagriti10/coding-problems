package arrays2;

import java.io.IOException;
import java.util.Arrays;

public class RotateArray {
	
	public static int[] rotateArray(int []a, int x, String dir) {
        // Write your code here.

        int n = a.length;
        x = x %n;
        if (dir == "LEFT") {
        	rotateLeft(a, x);
        } else {
        	rotateRight(a,x);
        }
        return a;
	}
	

	static void rotateLeft(int []a, int x) {
		int n = a.length;
		x = x %n;
		reverseArray(a, 0, n);
		reverseArray(a, 0, n-x);
		reverseArray(a, n-x, n);
	}
	
	static void rotateRight(int []a, int x) {
		int n = a.length;
		x = x %n;
		reverseArray(a, 0, n);
		reverseArray(a, 0, x);
		reverseArray(a, x, n);
	}
       
	static void reverseArray(int []arr, int start, int end){
                while (start < end) {
                	int temp;
                	temp = arr[start];
                	arr[start] = arr[end-1];
                	arr[end-1] = temp;
                	start ++;
                	end --;
                }
    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] input = {20 ,6 ,9 ,68 ,61 };
		int ans[] = rotateArray(input, 6, "LEFT");
       for(int i=0; i<ans.length; i++)
           System.out.print(ans[i]+" "); 
         }

}
