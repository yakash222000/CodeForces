import java.util.*;

public class CF977B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);  // Sort the array to process it in increasing order

            Map<Integer, Integer> map = new HashMap<>(); // To track the counts of remainders mod x
            int mex = 0;
            int index = 0;

            // First, process the array to form the initial MEX
            while (index < n) {
                if (arr[index] == mex) {  // If current element equals mex, we increase mex
                    map.put(mex % x, map.getOrDefault(mex % x, 0) + 1);
                    mex++;
                    index++;
                } else if (arr[index] < mex) {  // Add remainders for elements less than mex
                    map.put(arr[index] % x, map.getOrDefault(arr[index] % x, 0) + 1);
                    index++;
                } else {
                    // If we encounter an element greater than mex, try to form mex using map
                    if (map.containsKey(mex % x) && map.get(mex % x) >= 1) {
                        map.put(mex % x, map.get(mex % x) - 1);
                        mex++;
                    } else {
                        break;  // Can't form the next mex, break out of the loop
                    }
                }
                System.out.println(map + " "+ mex);
            }

            // Try to form further MEX values with remaining elements in map
            while (true) {
                if (map.containsKey(mex % x) && map.get(mex % x) >= 1) {
                    map.put(mex % x, map.get(mex % x) - 1);
                    mex++;
                } else {
                    break;  // No further mex can be formed, exit the loop
                }
                System.out.println(map +" "+mex);
            }

            // Output the maximum MEX found
            System.out.println(mex);
        }
        sc.close();  // Close the scanner to avoid resource leakage
    }
}
