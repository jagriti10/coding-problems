package arrays2;

public class findDuplicate {

    public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int k = 0;
        boolean visited[] = new boolean[arr.length];
        for (int i = 0 ; i < arr.length ; i++){
            boolean isDuplicate = false;
            if (visited[i] ==false){
                for(int j = i+1; j < arr.length; j++ ){
                    if(arr[i]==arr[j]){
                        isDuplicate = true;
                        visited[j] = true;
                    }
                }
            }
            if(isDuplicate){
                k = arr[i];
            }
        }
        return k;
    }
    public static void main(String[] args){
		int[] arr = {0, 2, 1, 3, 1};
		int unique = duplicateNumber(arr);
		System.out.println(unique);
	}
}

