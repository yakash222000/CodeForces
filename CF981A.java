import java.util.Scanner;

public class CF981A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = 0;
            int i = 1;
            while(Math.abs(x)<=n) {
                if(i%2==0) {
                    x += 2*i-1;
                }
                else {
                    x -= 2*i-1;
                }
                i++;
            }
            if(i%2!=0) {
                System.out.println("Kosuke");
            }
            else {
                System.out.println("Sakurako");
            }
        }
    }
}
