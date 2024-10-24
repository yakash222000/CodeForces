import java.util.*;
import java.util.Scanner;

public class CF974D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int k = sc.nextInt();
            int[][] jobs = new int[k][2];
            for (int i = 0; i < k; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                jobs[i][0] = l;
                jobs[i][1] = r;
            }

            // Sort the jobs based on start day

            Arrays.sort(jobs, Comparator.comparingInt(a -> a[0]));

            // Sliding window to find the best day for brother and mother
            int maxOverlaps = -1, minOverlaps = Integer.MAX_VALUE;
            int bestDayForBrother = -1, bestDayForMother = -1;

            // Two pointers to manage the sliding window
            int currentOverlap = 0;
            int jobStartIndex = 0, jobEndIndex = 0;

            // Use a map to count distinct jobs in the current window
            Map<Integer, Integer> activeJobs = new HashMap<>();

            // Slide the window over possible start days (from 1 to n-d+1)
            for (int startDay = 1; startDay <= n - d + 1; startDay++) {
                int endDay = startDay + d - 1;

                // Add jobs that start within the current window
                while (jobStartIndex < k && jobs[jobStartIndex][0] <= endDay) {
                    int jobEndDay = jobs[jobStartIndex][1];

                    // Only count jobs that overlap with the current window
                    if (jobEndDay >= startDay) {
                        activeJobs.put(jobStartIndex, activeJobs.getOrDefault(jobStartIndex, 0) + 1);
                        if (activeJobs.get(jobStartIndex) == 1) {
                            currentOverlap++;
                        }
                    }
                    jobStartIndex++;
                }

                // Remove jobs that end before the current window
                while (jobEndIndex < k && jobs[jobEndIndex][1] < startDay) {
                    if (activeJobs.getOrDefault(jobEndIndex, 0) > 0) {
                        activeJobs.remove(jobEndIndex);
                        currentOverlap--;
                    }
                    jobEndIndex++;
                }

                // Update the best day for brother (max overlaps)
                if (currentOverlap > maxOverlaps) {
                    maxOverlaps = currentOverlap;
                    bestDayForBrother = startDay;
                }

                // Update the best day for mother (min overlaps)
                if (currentOverlap < minOverlaps) {
                    minOverlaps = currentOverlap;
                    bestDayForMother = startDay;
                }
            }

            // Output the result for this test case
            System.out.println(bestDayForBrother + " " + bestDayForMother);

        }
    }
}
