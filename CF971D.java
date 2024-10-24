import java.util.HashSet;
import java.util.Scanner;

public class CF971D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            int count = 0;
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            for(int i = 0; i < n; i++) {
                if(arr[i][1]==0) set1.add(arr[i][0]);
                else set2.add(arr[i][0]);
            }
            for(int i = 0; i < n; i++) {
                if(arr[i][1]==0 && set1.contains(arr[i][0]) && set2.contains(arr[i][0])) {
                    count += set2.size() -1;
                }
                if(arr[i][1]==1 && set1.contains(arr[i][0]) && set2.contains(arr[i][0])) {
                    count += set1.size() -1;
                }
                if(arr[i][1] == 0 && set2.contains(arr[i][0]+1) && set2.contains(arr[i][0]-1)) {
                    count++;
                }
                if(arr[i][1]==1 && set1.contains(arr[i][0]+1) && set1.contains(arr[i][0]-1)){
                    count++;
                }
            }
            System.out.println(count);


        }
    }
}
