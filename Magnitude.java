import java.util.Arrays;
import java.util.Scanner;

public class Magnitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] dp = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.fill(dp,300001);
            System.out.println(help(arr,0,0,dp));
        }
    }
    public static int help(int[] arr, int start, int sum, int[] dp) {
        if (start == arr.length) {
            return 0;
        }
        if(dp[start]<300001) {
            return dp[start];
        }
        int one = arr[start]+help(arr, start + 1, sum + arr[start],dp);
        int two = Math.abs(sum + arr[start])+help(arr, start + 1, Math.abs(sum + arr[start]),dp);
        return dp[start]=Math.max(one, two);
    }
}
