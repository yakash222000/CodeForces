import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CF970D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String s = sc.next();
            int[] res = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 1; i <= n; i++){
                map.put(arr[i-1], Character.getNumericValue(s.charAt(i-1)));
            }
            for (int i = 0; i < n; i++) {
                HashSet set = new HashSet();
                int curr = arr[i];
                int count = 0;
                while(!set.contains(curr)){
                    set.add(curr);
                    curr = arr[curr-1];
                    if(map.get(curr)==0)count++;
                }
                res[i] = count;
                set.clear();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();

        }
    }
}
