package goodLogicalQues;

public class swapZeroAndOne {
	public static void main(String[] args)
    {
        int[] A = {1,0,1,1,0,0,1,0,1,1,0,0 };
        int n = A.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                //   Swap - A[j] , A[i]
                swap(A, j, i); // Partitioning the array
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " "); // Print the array
        }
    }
 
    // Utility function to swap two elements of an array
    public static void swap(int[] A, int a, int b)
    {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }

}
