import java.util.Scanner;

public class CF976B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long k = sc.nextLong();
            long count = 0;
            long num = 2;
            while(count < k) {
                if(isPrime(num)) count++;
                else {
                    if(countFactorsExcludingOne(num)%2==0) count++;
                }
                if(count == k) break;
                num++;

            }
            System.out.println(num);
        }
        sc.close();
    }

    public static int countFactorsExcludingOne(long n) {
        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
