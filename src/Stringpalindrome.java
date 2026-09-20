public class Stringpalindrome {
    static void main() {
        String str="malayala";
        int j=str.length()-1;
        boolean isPalindrome =true;
        for(int i=0;i<str.length()/2;i++)
        {

            if(str.charAt(i)!=str.charAt(j))
            {
                isPalindrome=false;
                System.out.println("the string is not palndrome");
                break;
            }

            j--;
        }
        if(isPalindrome)
        {
            System.out.println("the string is palndrome");
        }



    }
}
