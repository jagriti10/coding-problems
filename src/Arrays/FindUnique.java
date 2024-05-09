package Arrays;

public class FindUnique {


	    public static int findUnique(int[] arr){
			//Your code goes here
	            int k=0;
	        boolean [] visited = new boolean[arr.length];
	        for (int i = 0; i <arr.length ; i++) { 
	            int x = arr[i];
	            if(visited[i]==false) {
	                boolean isDuplicate = false;
	                for (int j = i + 1; j < arr.length; j++) {
	                    if (x == arr[j]) {
	                        isDuplicate = true;
	                        visited[j] = true;
	                    }
	                }
	                if (isDuplicate == false)
	                    k=x;

	            }
	        }

	        return k;
	    }
	    
	    public static void main(String args[]) {
	    	int arr[] = {2, 3, 1, 6, 3, 6, 2};
	    	int a[] = new int[7];
	    	System.out.println(arr.equals(a));
	    	//System.out.println(findUnique(arr));
	    	
	    	//char a;
	    	//System.out.println(a);
	    }
}
