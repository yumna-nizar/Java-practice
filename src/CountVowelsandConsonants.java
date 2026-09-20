public class CountVowelsandConsonants {
    static void main() {
        String str="You must be tired 123asasszz!";
        str=str.toLowerCase();
        int countOfVowels=0,countOfConsonants=0;

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(str.charAt(i)!=' ')
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
                {
                    countOfVowels++;
                }
                else if (ch>'a' && ch<='z')
                {
                    countOfConsonants++;
                }

            }

        }
        System.out.println("count of consonants is: "+countOfConsonants+" count of vowwels is: "+countOfVowels);
    }
}
