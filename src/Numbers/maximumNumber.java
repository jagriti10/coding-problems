package Numbers;

public class maximumNumber {
	
		public static int maximum69Number(int num) {
			int n = Integer.toString(num).length();
			int index = n-1;
			int[] digits = new int[n];
			
			while(num>0) {
				digits[index--] = num%10;
				num = num/10;
			}
			
			boolean isSix = true;
			int updatedNum = 0;
			for (int i = 0; i<digits.length; i++) {
				if(isSix && digits[i]==6) {
					digits[i]=9;
					isSix = false;
				}
				updatedNum = updatedNum*10+ digits[i];
			}

			return updatedNum;
		        
		    }
		
		public static void main(String args[]) {
			System.out.print(maximum69Number(9669));
		}
		
}
