import java.util.Scanner;

public class CF980A {
    private static boolean canOpenProfitable(long a, long b, long x) {
        return (a - x) >= (b - 2 * x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (a >= b) {
                System.out.println(a);
            } else {
                long left = 0;
                long right = a;
                long maxProfitableDeposit = 0;

                while (left <= right) {
                    long mid = (left + right) / 2;

                    if (canOpenProfitable(a, b, mid)) {
                        //System.out.println(mid);
                        maxProfitableDeposit = Math.max(maxProfitableDeposit, a - mid);
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }

                System.out.println(maxProfitableDeposit);
            }
        }

        sc.close();
    }
}
