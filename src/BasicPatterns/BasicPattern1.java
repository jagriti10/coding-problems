package BasicPatterns;
// Basic Pattern
//Pattern N=3
//
//###
//###
//###
// no of row = 3
// no of col = 3
public class BasicPattern1 {
    public static void gameOfPattern(int n) {
        
        int i =1;
        while(i<=n){
            int j =1;
            while(j<=n){
                System.out.print("#");
                j=j+1;
            }
            System.out.println();
            i = i+1;
        }
    }

    public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        sc.nextInt(); 
        while(sc.hasNextInt()){
            gameOfPattern(sc.nextInt());
        }
    }

}
