package BasicPatterns;
/*
Triangular Star Pattern
Pattern for N = 4
*
**
***
****

*/
public class BasicPattern4 {
	public static void gameOfPattern(int n) {
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}


		public static void main(String[] args) {
			java.util.Scanner sc = new java.util.Scanner(System.in);
		    int input = sc.nextInt(); 
		    gameOfPattern(input);
	}
}
