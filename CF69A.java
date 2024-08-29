import java.util.Scanner;

public class CF69A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=scanner.nextInt();
            arr[i][1]=scanner.nextInt();
            arr[i][2]=scanner.nextInt();
        }
        int sum1=0,sum2=0,sum3=0;
        for(int i=0;i<n;i++){
            sum1+=arr[i][0];
            sum2+=arr[i][1];
            sum3+=arr[i][2];
        }
        if(sum1==0 && sum2==0 && sum3==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
