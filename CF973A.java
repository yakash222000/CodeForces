import java.util.Scanner;

public class CF973A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y>=x) System.out.println(n/x + ((n%x==0)?0:1));
            else {
                System.out.println(n/y + ((n%y==0)?0:1));
            }
        }
    }
}
