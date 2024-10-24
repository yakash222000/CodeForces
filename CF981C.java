import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CF981C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();  // Length of the line of students
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();  // Topic of interest of student i
            }

            // Initialize DP arrays
            int[][] dp = new int[n][2];
            // Calculate initial disturbance for the first student
            dp[0][0] = (n > 1 && a[0] == a[1]) ? 1 : 0;
            dp[0][1] = (n > 1 && a[0] == a[n - 1]) ? 1 : 0; // If we swap with the last student

            for (int i = 1; i < n; i++) {
                // If we don't swap student at i
                dp[i][0] = dp[i - 1][0]; // Carry forward the disturbance
                if (i > 0 && a[i] == a[i - 1]) {
                    dp[i][0]++;
                }

                // If we swap student at i
                dp[i][1] = dp[i - 1][1]; // Carry forward the disturbance from swap
                if (i > 0 && a[i] == a[i - 1]) {
                    dp[i][1]++;
                }
                // Swap consideration
                if (a[i] == a[n - i - 1]) {
                    dp[i][1]--; // One less disturbance if they are swapped
                }
            }

            // Final result is the minimum disturbance after processing all students
            int result = Math.min(dp[n - 1][0], dp[n - 1][1]);
            System.out.println(result);
        }

        sc.close();
    }
}
