package SearchingAndSorting;

public class Sort012 {
	
    public static void sort012(int[] arr){
    	//Your code goes here
    	
    	int count0 = 0, count1 = 0, count2 = 0;

    	for (int i = 0 ; i < arr.length; i++) {
    		
    		if(arr[i] == 0) {
    			count0++;
    		} else if(arr[i] == 1){
    			count1++;
    		}else if(arr[i] == 2){
    			count2++;
    		}
    	}
    	
  
    	for (int i = 0 ; i < count0; i++) {
    		arr[i] = 0;
    
    	}
    	
    	for (int i = count0  ; i < count1; i++) {
    		arr[i] = 1;
    
    	}
    	
    	for (int i = arr.length - (count0 - count1) ; i < arr.length; i++) {
    		arr[i] = 2;
    
    	}
    	
    	for(int i = 0; i< arr.length ; ++i)
            System.out.print(arr[i]+" ");
    }
    
    public static void main(String[] args){
		int[] arr = {0, 1, 2, 0, 2, 0, 1};
		sort012(arr);
	}

}
