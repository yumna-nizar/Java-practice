import java.util.Scanner;

public class StringReverse {
    static void main() {

        StringBuilder sb=new StringBuilder("hello");
        int j=sb.length()-1;

        System.out.println(sb);
        int count=0;
        System.out.println(sb.length()/2);
        for(int i=0;i<sb.length()/2;i++)
        {

            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            j--;

        }
        System.out.println(sb);
    }
}
