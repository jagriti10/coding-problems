package Numbers;

public class Armstrong {

	public static void main(String[] args) {
		
		int n = 153;
		
		int orgNum = n;
		
		int sum = 0, num = 0;
		
		while(n>0) {
			num = n % 10 ;
			n = n /10;
			sum = sum + num * num * num;
		}
		
		if (sum == orgNum) {
			System.out.println("It is an Armstrong number");
		} else {
			System.out.println("It is not an Armstrong number");
		}

	}

}
