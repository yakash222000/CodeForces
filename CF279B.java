import java.util.Scanner;

public class CF279B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(),t= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0,j=0,sum=0,ans=0;
        while(j<n){
            if(sum+arr[j]<=t){
                sum+=arr[j];
                j++;
            }
            else{
                sum-=arr[i];
                i++;
            }
            ans=Math.max(ans,j-i);

        }
        System.out.println(ans);
    }
}
