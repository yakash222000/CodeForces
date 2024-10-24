import java.util.HashMap;
import java.util.Scanner;

public class CF981E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt(); // Length of the permutation
            int[] p = new int[n]; // Permutation (0-indexed)

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt(); // Elements of the permutation
            }

            boolean[] visited = new boolean[n]; // Track visited elements
            int totalSwaps = 0;

            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    // Start of a new cycle
                    int cycleLength = 0;
                    int j = i;

                    while (!visited[j]) {
                        visited[j] = true; // Mark the current element as visited
                        j = p[j] - 1; // Adjust for zero-based indexing
                        cycleLength++;
                    }

                    // If cycle length is 3 or more, we need (cycleLength - 1) / 2 swaps
                    if (cycleLength >= 3) {
                        int swapsNeeded = (cycleLength - 1) / 2;
                        totalSwaps += swapsNeeded;
                    }
                }
            }

            System.out.println(totalSwaps); // Print the total number of swaps needed
        }

        sc.close();
    }
}
