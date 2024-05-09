package arrays2;

import java.io.IOException;

public class ReverseArrayUptoAPosition {
	public static int[] reverseBetween(int n, int l, int r, int []a) {
        // Write your code from here.

        int k = r-l;
    
        while (l < r) {
        	int temp;
        	temp = a[l];
        	a[l] = a[r];
        	a[r] = temp;
        	l ++;
        	r --;
        }
        return a;
    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] input = {21 ,6 ,46 ,36 ,10 };
		int ans[] = reverseBetween(5, 0, 3, input);
       for(int i=0; i< ans.length; i++)
           System.out.print(ans[i]+" "); 
         }
	//21 6 46 36 10
	//36 46 6 21 10
}
