import java.util.Scanner;

public class CF967C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int m = sc.nextInt();
            int[] arr = new int[(m-1)*2];
            int index=0;
            for(int i = 0; i < m; i++) {
                for(int j = i+1; j < m; j++) {
                    System.out.print("? i j");
                    int check = sc.nextInt();
                    if(check == 1) {
                        arr[index] = i;
                        arr[index+1] = j;
                        index+=2;
                    }
                }
            }
            System.out.print("!");
            for(int i = 0; i < (m-1)*2; i++) System.out.print(" "+arr[i]);
            System.out.println();
        }
    }
}
