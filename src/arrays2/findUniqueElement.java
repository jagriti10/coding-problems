package arrays2;

import java.util.Arrays;

public class findUniqueElement {
	public static int findUnique(int[] arr){
		int k=0;
        boolean [] visited = new boolean[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            int num = arr[i];
            if(visited[i]==false) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (num == arr[j]) {
                        isDuplicate = true;
                        visited[j] = true;
                    }
                }
                if (isDuplicate)
                    k=num;

            }
        }

        return k;
	}
	
	
	public static void main(String[] args){
		int[] arr = {0, 2, 1, 3, 1};
		int unique = findUnique(arr);
		System.out.println(unique);
	}
	
}
