package Maps;

public class TwoSumSorted {
	
    static int[] twoSum(int[] numbers, int target) {

        int i = 0 , j = numbers.length -1;
        int[] res = new int[2];

        while(i<j){
            if( numbers[i] + numbers[j] == target){
                res[0] = numbers[i];
                res[1] = numbers[j];
            } else if (numbers[i] + numbers[j] < target){
                i++;
            } else {
                j--;
            }
        }
        return res;
    }

	public static void main(String[] args) {
		int[] a = {2,7,11,15};
		int[] b = twoSum(a,9);
		
		for(int i = 0 ; i < b.length ; i++) {
			System.out.println(b[i]);
		}
	}

}
