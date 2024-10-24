import java.util.Scanner;

public class CF970A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if((a&1)==1) System.out.println("NO");
            else {
                if((b&1)==1 && a>0) System.out.println("YES");
                else if((b&1)==0) System.out.println("YES");
                else System.out.println("NO");
            }

        }
    }
}
