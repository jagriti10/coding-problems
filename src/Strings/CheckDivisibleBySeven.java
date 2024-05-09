package Strings;

public class CheckDivisibleBySeven {
	
	static void isDivisibleBy7(String n) {
		int num = Integer.parseInt(n);
		
		if(num < 0) {
			System.out.println("Input number greater than 0");
			
		} else {
		int lastDigit = num%10;
		int restNumber = num/10;
		int res = restNumber - (2 * lastDigit);
		
		if(res%7 == 0) {
			System.out.println(n + " is divisible by 7");
		}
		else {
			String restNumberString = String.valueOf(restNumber);
			isDivisibleBy7(restNumberString);
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isDivisibleBy7("2455");
		
		//int s = -77- -98;
		//System.out.println(s);
	}

}
