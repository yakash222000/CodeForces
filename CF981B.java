import java.util.Scanner;

public class CF981B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int ans = 0;
            for(int k = 0; k < n; k++) {
                int j=0, i=k;
                int min = 0;
                while(i<n && j<n) {
                    if(arr[i][j]<0) min = Math.min(min, arr[i][j]);
                    i++;
                    j++;
                }
                ans += Math.abs(min);
                //System.out.println(ans + " " + (i+1));
            }
            //System.out.println(ans);
            for(int k = 1; k < n; k++) {
                int j=0, i=k;
                int min = 0;
                while(i<n && j<n) {
                    if(arr[j][i]<0) min = Math.min(min, arr[j][i]);
                    i++;
                    j++;
                }
                ans += Math.abs(min);
            }
            System.out.println(ans);
        }
    }
}
