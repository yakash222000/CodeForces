import java.util.Arrays;
import java.util.Scanner;

public class CF974C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if(n<3) System.out.println(-1);
            else {
                Arrays.sort(arr);
                long amount = 2 * arr[n / 2]; // Use long for amount
                long total = 0;
                for (long i : arr) {
                    total += i;
                }
                double avg = (double) total / n; // Casting total to double for avg calculation
                if (avg > amount) {
                    System.out.println(0);
                } else {
                    long x = (amount * n - total) + 1; // Ensure x uses long
                    System.out.println(x);
                }


            }
        }
    }
}
