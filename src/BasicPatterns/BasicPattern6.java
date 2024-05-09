package BasicPatterns;
/*
Reverse Number Pattern
Pattern for N = 4
1
21
321
4321

*/
public class BasicPattern6 {

	public static void trianglePattern(int n) {
		// Write your code here
		int i = 1;
		while (i <= n) {
			int p = i;
			int j = 1;
			while (j <= i) {
				System.out.print(p);
				p = p - 1;
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}

	}

	public static void main(String[] args) {

		/*
		 * Your class should be named Solution.
		 * Read input as specified in the question.
		 * Print output as specified in the question.
		 */

		java.util.Scanner sc = new java.util.Scanner(System.in);
		int input = sc.nextInt();
		trianglePattern(input);
	}
}
