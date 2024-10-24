import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CF970B {

    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false; // Negative numbers cannot be perfect squares
        }
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = (int) Math.sqrt(n);
            String s = sc.next();
            if(!isPerfectSquare(n) || n<4) {
                System.out.println("NO");
            }
            else {
                boolean found = false;
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        int index = i*m+j;
                        if(i==0 || i==m-1 || j==0 || j==m-1) {
                            if(s.charAt(index) == '0') {
                                found = true;
                            }
                        }
                        else {
                            if(s.charAt(index) == '1') {
                                found = true;
                            }
                        }
                    }
                }
                if(found) {
                    System.out.println("NO");
                }
                else {
                    System.out.println("YES");
                }
            }

        }
    }
}
