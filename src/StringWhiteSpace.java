public class StringWhiteSpace {
    static void main() {
//        StringBuilder str=new StringBuilder("yumna Nizar adddfds sdfdsf");
//        for(int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)==' ')
//            {
//                str.deleteCharAt(i);
//            }
//        }
//        System.out.println(str);


        //second apporach
//        String str="YUMNA NIzar for what";
//        String replacedstring=str.replaceAll("\\s","");
//        System.out.println(replacedstring);

        //third apprach

        String str1="YUmna NIzar for what  \t i dont know\n how about you?";
        String str2="";
        int i=0;
        while(i<str1.length())
        {
            char ch=str1.charAt(i);
            if(ch!=' ' && ch!='\t' && ch!='\n')
            {
                str2+=ch;
            }
            i++;
        }
        System.out.println(str2);
    }
}
