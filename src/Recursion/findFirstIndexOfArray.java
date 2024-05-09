package Recursion;

public class findFirstIndexOfArray {
public static int firstIndex(int input[], int x) {
		
		int index =  firstIndexByIndex(input, 0, x);
		return index;
	}

	public static int firstIndexByIndex(int[] input, int si, int x){
		if(si == input.length) {
			return -1;
		}
		if(input[si] == x){
			return si;
		}

		int ind = firstIndexByIndex(input, si+1, x);
		return ind;
	}
}
