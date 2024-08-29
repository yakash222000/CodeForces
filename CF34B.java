import java.util.Arrays;
import java.util.Scanner;

public class CF34B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<m;i++){
            if(arr[i]>0) break;
            ans-=arr[i];
        }
        System.out.println(ans);
    }
}
