package SearchingAndSorting;

// not the right approach
public class MergeTwoSortedArrays {
	public static int[] merge(int arr1[], int arr2[]) {
		
		int[] arr3 = new int[arr1.length+arr2.length];
		
		for(int i = 0 ; i < arr3.length ; i=i+2) {
			if (arr1[i] < arr2[i]) {
				arr3[i] = arr1[i];
				arr3[i+1] = arr2[i];
			} else {
				arr3[i] = arr2[i];
				arr3[i+1] = arr1[i];
			}
		}
		
		return arr3;
	}
	
	public static void main(String[] args){
		int[] arr1 = {1, 3, 4, 7, 11};
		int[] arr2 = {2, 4, 6, 13};
		merge(arr1, arr2);
	}
}
