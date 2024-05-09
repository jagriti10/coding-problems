package BasicPatterns;
/*
Alpha Pattern
Pattern for N = 3
A
BB
CCC
*/
public class BasicPattern8 {
	public static void gameOfAlphabet(int n) {
		int i = 1;
		char p = 65;
		while (i <= n) {
			int j = 1;
			while (j <= i) {
				System.out.print(p);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
			p = (char) (p + 1);
		}
	}

	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int input = sc.nextInt();
		gameOfAlphabet(input);
	}
}
