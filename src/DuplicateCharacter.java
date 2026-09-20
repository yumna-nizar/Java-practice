public class DuplicateCharacter {
    static void main() {
        StringBuilder str=new StringBuilder("Hello  bbba bbadddss");

        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(i==j)
                {
                    continue;
                }
                else
                {
                    if(str.charAt(i)==str.charAt(j))
                    {
                        str.deleteCharAt(j);
                    }
                }
            }
        }
        System.out.println(str);

    }
}
