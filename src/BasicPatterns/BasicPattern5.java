package BasicPatterns;
/*
Descending order Pattern
Pattern for N = 5
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
*/
public class BasicPattern5 {

    public static void trianglePattern(int n) {
        // Write your code here
        int i = 1;
        while (i <= n) {
            int p = 0;
            int j = 1;
            while (j <= i) {
                System.out.print(n-p+" ");
                p = p+1;
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
