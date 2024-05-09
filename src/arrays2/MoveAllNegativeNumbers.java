package arrays2;

import java.util.Scanner;

public class MoveAllNegativeNumbers {
	public static int[] moveAllNegativesApproach1(int[] arr) {
    	//Your code goes here
		
		int j = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] < 0) {
				int temp;
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
		
		return arr;
    }
	
	public static int[] moveAllNegativesApproach2(int[] arr) {
		int l = 0;
		int r = arr.length - 1;
		while(l < r) {
			if(arr[l] > 0 && arr[r]>0) {
				r--;
			} else if (arr[l]>0 && arr[r]<0) {
				int temp;
				temp = arr[r];
				arr[r] = arr[l];
				arr[l] = temp;
				l++;
				r--;
			} else if (arr[l] < 0 && arr[r] > 0) {
				l++;
				r--;
			} else if (arr[l] < 0 && arr[r] < 0) {
				l++;
			} 
		}
		
		return arr;
    }
	public static void verifyResult(int[] arr1, int[] arr2) {
    	
		if(arr1 ==  arr2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

    }
	
	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//
//		while(n>0) {
//		int noOfInput = sc.nextInt();
//                int arr[] = new int[noOfInput];
//
// 		for (int i = 0; i < noOfInput; i++) {
//                if (sc.hasNextInt()) {
//                    arr[i] = sc.nextInt();
//                }
//                } 
//        	verifyResult(moveAllNegativesApproach1(arr),moveAllNegativesApproach2(arr));
//        	n--;
//        }
		
		int arr[] = {1,2,3,4,5,6}; 
		int start = 0, end = 5;
		while(start<end)
		{
		    while(start<end && (arr[end]%2==0))
		        end--;
		    if(start>=end)
		        break;
		    if(arr[start]%2==0)
		    {
		        int temp;
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
		        end--;
		    }
		    start++;
		}
		
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
		}
	}
}
