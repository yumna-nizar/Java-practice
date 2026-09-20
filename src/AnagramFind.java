import java.util.Arrays;

public class AnagramFind {
    public static Boolean Anagram(String s,String t)
    {
        String str1=s.replaceAll(" ","");
        String str2=t.replaceAll(" ","");
        if(str1.length()!=str2.length())
        {
            System.out.println("Strings are not  anagram");
            return false;
        }
        else {
            char[] charrray1=str1.toCharArray();
            char[] charrray2=str2.toCharArray();
            Arrays.sort(charrray1);
            Arrays.sort(charrray2);
            return Arrays.equals(charrray1,charrray2);
        }

    }

    static void main() {

        System.out.println(Anagram("ab","aabbb"));
    }
}
