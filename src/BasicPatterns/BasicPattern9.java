package BasicPatterns;
/*
Character Pattern
Pattern for N = 4
A
BC
CDE
DEFG
*/
public class BasicPattern9 {
	public static void gameOfAlphabet(int n) {
		int i = 1;
		while (i <= n) {
			char p = (char) ('A' + i - 1);
			int j = 1;
			while (j <= i) {
				System.out.print(p);
				p = (char) (p + 1);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}

	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int input = sc.nextInt();
		gameOfAlphabet(input);
	}
}
