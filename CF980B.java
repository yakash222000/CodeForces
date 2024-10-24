import java.util.Arrays;
import java.util.Scanner;

public class CF980B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long count = 0;
            if(arr[0]*n>=k){
                System.out.println(k);
            }
            else{
                count += (long)arr[0]*n+1;
                k -= (long)arr[0]*n;
                for (int i = 1; i < n; i++) {
                    if((long)(arr[i]-arr[i-1])*(n-i)>=k){
                        System.out.println(count + k);
                        break;
                    }
                    else {
                        count += (long)(arr[i]-arr[i-1])*(n-i)+1;
                        k -= (long)(arr[i]-arr[i-1])*(n-i);
                    }
                }
            }

        }
    }
}
