import java.util.Scanner;

public class CF971C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();
            int count1 = x/k + (x%k == 0 ? 0 : 1);
            int count2 = y/k + (y%k == 0 ? 0 : 1);
            if(count1==count2) {
                System.out.println(2*count1);
            }
            else if(count1>count2) {
                System.out.println(2*count1-1);
            }
            else {
                System.out.println(2*count2);
            }
        }
    }
}
