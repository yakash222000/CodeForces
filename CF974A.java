import java.util.Scanner;

public class CF974A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int curr = 0;
            int count = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for(int i : arr) {
                if(i>=k) curr += i;
                if(i==0 && curr>0) {
                    count++;
                    curr--;
                }
            }
            System.out.println(count);

        }
    }
}
