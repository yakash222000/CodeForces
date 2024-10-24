import java.util.Scanner;

public class CF973B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] ratings = new int[n];
            for (int i = 0; i < n; i++) {
                ratings[i] = sc.nextInt();
            }
            long sum = 0;
            for(int i=0; i<n-2;i++) sum += ratings[i];
            System.out.println((long)ratings[n-1]-((long)ratings[n-2]-sum));
        }
    }
}
