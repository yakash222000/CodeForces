import java.util.HashMap;
import java.util.Scanner;

public class CF967A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i : a) map.put(i, map.getOrDefault(i, 0) + 1);
            int max = 0;
            for(int k : map.keySet()){
                max = Math.max(max, map.get(k));
            }
            System.out.println(n-max);
        }
    }
}
