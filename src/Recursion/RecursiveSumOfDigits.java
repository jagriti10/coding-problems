package Recursion;

import java.io.IOException;

public class RecursiveSumOfDigits {
	
	public static int sumOfDigits(int input){
		
		if(input == 0) {
			return 0;
		}
		int smallSum = sumOfDigits(input/10);
		int ans = input%10 + smallSum;
		return ans;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		int ans = sumOfDigits(12345);
		 System.out.print(ans); 
         }

}
