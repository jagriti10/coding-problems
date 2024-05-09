package arrays2;

public class Intersection {
	
	public static void intersection(int arr1[], int arr2[]) {
		for(int i=0;i<arr1.length;i++)
        {   
         
                  for(int j=0;j<arr2.length;j++)
                    {

                      if(arr1[i]==arr2[j])
                      {System.out.println(arr1[i]);
                       arr2[j]=Integer.MIN_VALUE;
                       break;
                       
                      }
                    }

        }
    }
	public static void main(String[] args){
		int[] arr1 = {10,10};
		int[] arr2 = {10}; 
		intersection(arr1, arr2);
	}

}
