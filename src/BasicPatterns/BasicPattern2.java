package BasicPatterns;
// Square Pattern
//Pattern for N = 4
//4444
//4444
//4444
//4444
// no of row = 4
// no of col = 4
public class BasicPattern2 {
    public static void gameOfPattern(int n) {
        
        int i =1;
        while(i<=n){
            int j =1;
            while(j<=n){
                System.out.print(n);
                j=j+1;
            }
            System.out.println();
            i = i+1;
        }
    }

    public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int input = sc.nextInt(); 
        gameOfPattern(input);
    }

}
