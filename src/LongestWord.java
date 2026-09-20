public class LongestWord {
    static void main() {
        String str = "hello whererareyou YumnaNIzar From coming";
        String longestword="";
//        String[] words=str.split(" ");
        int pointer=0;

        for(int i=0;i< str.length();i++)
        {
            StringBuilder str2=new StringBuilder("");
            Boolean flag=true;

            while(flag==true && pointer<str.length())
            {

                if(str.charAt(pointer)!=' ')
                {
                    str2=str2.append(str.charAt(pointer));
                }
                else {
                    flag=false;
                }
                pointer++;
            }
            if(str2.length()>longestword.length())
            {
                longestword=str2.toString();
            }
        }
        System.out.println(longestword);



//        for(String word:words)
//        {
//            if(word.length()>longestword.length())
//            {
//                longestword=word;
//            }
//        }
//        System.out.println(longestword);


    }
}
