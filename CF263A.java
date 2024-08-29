import java.util.Scanner;

public class CF263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int x=0,y=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1){
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println(Math.abs(x-2)+Math.abs(y-2));
    }
}
