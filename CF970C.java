import java.util.Scanner;

public class CF970C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = 0;
            int curr = l;
            int val = 1;
            while(curr <= r) {
                ans++;
                curr += val;
                val++;
            }
            System.out.println(ans);
        }
    }
}
