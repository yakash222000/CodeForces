import java.util.Scanner;

public class CF973C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean flow = true;
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < 2*n; i++) {
                int response1 = 1;
                int response2 = 1;
                if(flow){
                    StringBuilder guess1 = s.append("0");
                    System.out.println("? "+guess1.toString());
                    System.out.flush();
                    response1 = sc.nextInt();
                    if(s.length()==n && response1==1) break;
                    s.deleteCharAt(s.length()-1);
                    if(response1==0) {
                        StringBuilder guess2 = s.append("1");
                        System.out.println("? "+guess2.toString());
                        System.out.flush();
                        response2 = sc.nextInt();
                        if(s.length()==n && response2==1) break;
                        s.deleteCharAt(s.length()-1);
                    }
                }
                else{
                    StringBuilder guess1 = s.insert(0, "0");
                    System.out.println("? "+guess1.toString());
                    System.out.flush();
                    response1 = sc.nextInt();
                    if(s.length()==n && response1==1) break;
                    s.deleteCharAt(0);
                    if(response1==0) {
                        StringBuilder guess2 = s.insert(0, "1");
                        System.out.println("? " + guess2.toString());
                        System.out.flush();
                        response2 = sc.nextInt();
                        if (s.length() == n && response2 == 1) break;
                        s.deleteCharAt(0);
                    }
                }

                if(response1==0 && response2==0) {
                    flow = false;
                }
                else if(response1==0 && response2==1) {
                    if(flow) s.append("1");
                    else s.insert(0,"1");
                }
                else if(response1==1 && response2==0) {
                    if(flow) s.append("0");
                    else s.insert(0,"0");
                }
                else {
                    if(flow) s.append("0");
                    else s.insert(0,"0");
                }


            }
            s.insert(0, "! ");
            System.out.println(s.toString());
        }
    }
}
