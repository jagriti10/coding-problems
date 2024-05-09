package arrays2;

import java.util.Arrays;

public class Selection{

	static void Sec(int[]arr){
    for(int i=0;i<arr.length;i++){
     int last = arr.length - i -1;
     int max= getMaxindex(arr, 0, last);
    }
	}
	
    static void swap(int[]arr, int first, int second){
    int temp= arr[first];
    arr[first]= arr[second];
    arr[second]=temp;
    }

 private static int getMaxindex(int[] arr, int start , int end){
     int max=start;
     for(int i=start; i<=end;i++){
         if(arr[max]>arr[i]){
             max = i;
         }
     }
     return max;
 }
 public static void main(String[]args){
	 int[]arr = {17,35,88,16,77};
	 Sec(arr);
	 System.out.println(Arrays.toString(arr));
	 }   
}
