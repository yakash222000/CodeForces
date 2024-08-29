import java.util.Scanner;

public class CF967B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if(n%2 == 0) System.out.println(-1);
            else if(n==1) System.out.println(1);
            else{
                int[] arr = new int[n];
                int val = n-1;
                for(int i=0; i<n/2; i++){
                    arr[i] = val;
                    val-=2;
                }
                val=1;
                for(int i=n/2; i<n; i++){
                    arr[i] = val;
                    val+=2;
                }
                for(int i=0; i<n; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
