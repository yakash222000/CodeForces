import java.util.HashSet;
import java.util.Scanner;

public class CF271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true){
            n++;
            if(check(n)){
                break;
            }
        }
        System.out.println(n);
    }
    public static boolean check(int num){
        HashSet<Integer> set = new HashSet<>();
        while(num>0){
            if(set.contains(num%10)) return false;
            set.add(num%10);
            num/=10;
        }
        return true;
    }
}
