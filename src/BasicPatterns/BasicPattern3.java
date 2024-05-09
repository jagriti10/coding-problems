package BasicPatterns;
/*
Triangular Number Pattern
Pattern for N = 4
1
22
333
4444
*/
public class BasicPattern3 {
	public static void gameOfPattern(int n) {
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print(i);
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
