package Recursion;

public class Stairways {
		
		
	     public static int staircase(int n){
			
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
	    	System.out.println("n= "+ n);
	        if(n<0)
	            return 0;
	        if(n==0)
	            return 1;
	        int op1=staircase(n-1);
	        System.out.println("OP1 "+op1);
	        int op2=staircase(n-2);
	        System.out.println("OP2 "+op2);
	        int op3=staircase(n-3);
	        System.out.println("OP3 "+op3);
	        System.out.println("op1+op2+op3 = "+ op1+op2+op3);
	        return op1+op2+op3;
		}
	     public static void main(String[]args){
	    	 System.out.println(staircase(4));
	     }
}
