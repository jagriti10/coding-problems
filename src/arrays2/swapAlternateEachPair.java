package arrays2;

public class swapAlternateEachPair {
	
	public static void swapAlternateEach(int input[]) {
    	//Your code goes here
		for(int i=0;i<input.length-1;i+=2)
        {
            int  a;
            a=input[i];
            input[i]=input[i+1];
            input[i+1]=a;
        }
		
	
	for (int element: input) {
        System.out.print(element+ " ");
    }
	System.out.println();
		
    }

	public static void main(String[] args){
		
		int[] arr1 = {4, 3, 6, 12, 4, 32};
		int[] arr2 = {1 ,2 ,3 ,4 ,5 ,6};
		swapAlternateEach(arr1);
		swapAlternateEach(arr2);
}
}
