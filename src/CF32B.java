import java.util.Scanner;

public class CF32B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index=0;
        StringBuilder str = new StringBuilder("");
        while(index<s.length()){
            if(s.charAt(index)=='.'){
                str.append('0');
                index++;
            }
            else if(s.charAt(index+1)=='.'){
                str.append('1');
                index+=2;
            }
            else {
                str.append('2');
                index+=2;
            }
        }
        System.out.println(str.toString());

    }

}
