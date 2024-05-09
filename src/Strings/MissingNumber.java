package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9,6,4,2,3,5,7,0,1};
		boolean[] res = new boolean[arr.length+1];
		
		for(int i = 0 ; i < arr.length ; i++) {	
			res[arr[i]] = true;
		}
		
		int index = 0;
		 for (boolean obj : res) { 
			 if(!obj) {
				 System.out.println(index + " is missing");
				 break;
			 }
			 index++;
		 }
		 }
			
			

}
