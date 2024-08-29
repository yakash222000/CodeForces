import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class CF968C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for ( char c : s.toCharArray() ) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int index = 0;
            StringBuilder str = new StringBuilder(s);
            PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {

                @Override
                public int compare(Pair p1, Pair p2) {
                    return p2.count - p1.count;
                }
            });
            for(char c : map.keySet() ) {
                pq.add(new Pair(c, map.get(c)));
            }
            while(!pq.isEmpty()) {
                Pair p = pq.poll();
                char ch = p.c;
                int cnt = map.get(ch);
                while(cnt > 0) {
                    str.setCharAt(index,ch);
                    index+=2;
                    if(index>=s.length()) index=1;
                    cnt--;
                }
            }
            System.out.println(str.toString());
        }
    }
}

class Pair {
    char c;
    int count;
    public Pair(char c, int count) {
        this.c = c;
        this.count = count;
    }
}
