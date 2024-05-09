package BasicPatterns;
/*
Interesting Alphabets
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
*/
public class BasicPattern12 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		while (i <= n) {
			int j = 1;
			char p = (char) ('A' + n - i);
			while (j <= i) {
				System.out.print(p);
				p = (char) (p + 1);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
