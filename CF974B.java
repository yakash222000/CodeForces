import java.util.Scanner;

public class CF974B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int noOfOdds = 0;
            if(k == 1) {
                if(n%2==0) System.out.println("YES");
                else System.out.println("NO");
                continue;
            }
            else {
                if(n%2==0 ) {
                    noOfOdds = k/2;
                }
                else {
                    noOfOdds = k/2+k%2;
                }
            }
            if(noOfOdds%2==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
