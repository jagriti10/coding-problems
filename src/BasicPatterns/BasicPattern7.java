package BasicPatterns;
/*
Alphabetic triangle
Pattern N=3

A

A B

A B C

*/
public class BasicPattern7 {

	public static void gameOfAlphabet(int n) {
        // Write your code here

                int i = 1;
                while (i <= n) {
                    int j = 1;
                    char p = 65;
                    while (j <= i) {
                        System.out.print(p+" ");
                        p = (char) (p + 1);
                        j = j + 1;
                    }
                    System.out.println();
                    i = i + 1;
                }
            }

            public static void main(String args[]) {
                java.util.Scanner sc = new java.util.Scanner(System.in);
                sc.nextInt();
                while (sc.hasNextInt()) {
                    gameOfAlphabet(sc.nextInt());
                }
            }
}
