import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CF980C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            Arrays.sort(arr, (a, b) -> {
                if(a[0] == b[0])
                    return Integer.compare(a[1], b[1]);
                return Integer.compare(a[0], b[0]);
            });

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][0] + " " + arr[i][1] + " ");
            }
            System.out.println();
        }
    }
}
