import java.util.Scanner;

public class CF266B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        String s=sc.next();
        char[] ch =s.toCharArray();
        char temp;
        for(int j=0;j<t;j++)
        {
            for(int i=0;i<ch.length-1;i++)
            {
                if(ch[i]=='B' && ch[i+1]!='B')
                {
                    temp=ch[i];
                    ch[i]=ch[i+1];
                    ch[i+1]=temp;
                    i++;
                }
            }
        }
        for (char c : ch) {
            System.out.print(c);
        }
    }
}
