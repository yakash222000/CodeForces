import java.util.Scanner;

public class CF1997B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Character[][] matrix = new Character[n][2];
            String s1 = sc.next();
            String s2 = sc.next();
            for (int i = 0; i < n; i++) {
                matrix[i][0] = s1.charAt(i);
            }
            for (int i = 0; i < n; i++) {
                matrix[i][1] = s2.charAt(i);
            }
            int count = 0;
            for (int i = 1; i < n-1; i++) {
                if(matrix[i][0].equals('.') && matrix[i-1][0].equals(".")
                && matrix[i+1][0].equals(".") && matrix[i][1].equals(".")
                && matrix[i+1][1].equals("x") && matrix[i-1][1].equals("x")){
                    count++;
                }
                if(matrix[i][1].equals(".") && matrix[i-1][1].equals(".")
                        && matrix[i+1][1].equals(".") && matrix[i][0].equals(".")
                        && matrix[i+1][0].equals("x") && matrix[i-1][0].equals("x")){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
