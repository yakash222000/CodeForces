import java.util.Arrays;
import java.util.Scanner;

public class CF976A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int operations = 0;

            if (k == 1 || n<k) {
                System.out.println(n);
                continue;
            }
            long[] powers = new long[32];
            Arrays.fill(powers,Integer.MAX_VALUE);
            powers[0] = 1;

            for (int i = 1; i < 32; i++) {
                powers[i] = powers[i - 1] * k;
                //System.out.println(powers[i]);
                if (powers[i] > n) break;
            }

            for (int i = 31; i >= 0; i--) {
                if (powers[i] > n) continue;
                operations += n/powers[i];
                n %= powers[i];
            }

            System.out.println(operations+n);
        }
    }
}
