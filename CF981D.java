import java.util.*;

public class CF981D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();  // Length of the array
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();  // Elements of the array
            }

            // Solve the problem for this test case
            System.out.println(solve(n, a));
        }

        sc.close();
    }

    private static int solve(int n, int[] a) {
        long prefixSum = 0;  // To store the cumulative sum
        Map<Long, Integer> lastIndexMap = new HashMap<>();  // To store the last index of each prefix sum
        lastIndexMap.put(0L, -1);  // To handle segments starting from index 0
        int[] dp = new int[n];  // DP array to store the number of beautiful segments
        int maxSegments = 0;  // To store the maximum number of non-overlapping segments

        for (int i = 0; i < n; i++) {
            prefixSum += a[i];  // Update the prefix sum

            if (lastIndexMap.containsKey(prefixSum)) {
                int lastIndex = lastIndexMap.get(prefixSum);  // The last index where this prefix sum was seen
                // Calculate the maximum segments if we take the current beautiful segment
                dp[i] = (lastIndex == -1 ? 0 : dp[lastIndex]) + 1;
            }

            // Carry forward the maximum segments found up to index i-1
            if (i > 0) {
                dp[i] = Math.max(dp[i], dp[i - 1]);
            }

            // Update the last seen index of the current prefix sum
            lastIndexMap.put(prefixSum, i);

            // Update the global maximum
            maxSegments = Math.max(maxSegments, dp[i]);
        }

        return maxSegments;
    }
}
