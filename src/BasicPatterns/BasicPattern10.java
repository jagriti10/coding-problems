package BasicPatterns;
/*
Reverse Character Pattern
Pattern for N = 5
E
ED
EDC
EDCB
EDCBA
*/
public class BasicPattern10 {
    public static void alphabetPattern(int n) {
		int i = 1;
		while (i <= n) {
			int j = 1;
			char p = (char) ('A' + n - 1);
			while (j <= i) {
				System.out.print(p);
				p = (char) (p - 1);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
    
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int input = sc.nextInt();
        alphabetPattern(input);
    }
}
