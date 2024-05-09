package BasicPatterns;

import java.util.Scanner;

public class PatternPractise {
	public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

		java.util.Scanner sc = new java.util.Scanner(System.in);
        int number = sc.nextInt();
        int i = number, j;
        while (i > 0) {
            j = 0;
            while (j++ < number - i) {
                System.out.print(" ");
            } 
            j = 0;
            while (j++ < i) {
                System.out.print("*");
            }
            System.out.println();
            i--;
	
	}
	}

}
