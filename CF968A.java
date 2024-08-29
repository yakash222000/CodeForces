import java.util.Scanner;

public class CF968A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            if(s.charAt(0) != s.charAt(n-1)) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
