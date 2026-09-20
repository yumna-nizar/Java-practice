public class ToggleCharacter {
    static void main() {
        StringBuilder str1=new StringBuilder("YuMNa NiZaR");

        for(int i=0;i< str1.length();i++)
        {
            char ch1=str1.charAt(i);
            int uni=(int)ch1;
            if(uni<95 && uni!=32)
            {
                ch1=(char)(ch1+32);
                str1.setCharAt(i,ch1);
            }
            else if(uni==32)
            {
                str1.setCharAt(i,ch1);
            }
            else{
                ch1=(char)(ch1-32);
                str1.setCharAt(i,ch1);
            }

        }
        System.out.println("the toggled string is: "+str1);
    }
}
