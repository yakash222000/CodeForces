import java.util.Scanner;

public class CF976C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
            long a = 0;
            boolean valid = true;

            for (int i = 0; i < 63; i++) {
                long bitB = (b >> i) & 1;
                long bitC = (c >> i) & 1;
                long bitD = (d >> i) & 1;
                if (bitD == 1) {
                    if (bitC == 1) {
                        if (bitB == 0) {
                            valid = false;
                            break;
                        }
                    } else {
                        a |= (1 << i);
                    }
                } else {
                    if (bitC == 1) {
                        if (bitB == 1) {
                            a |= (0 << i);
                        }
                    }
                }
            }

            if (valid) {
                System.out.println(a);
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}
