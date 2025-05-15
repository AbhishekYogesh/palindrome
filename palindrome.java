import java.util.*;
class palindrome
{
    public static void main(String word)
    {
        Scanner sc =new Scanner(System.in);
        String s = "";
        int i,p;
        char c;
        p = word.length();
        for(i = p-1;i>=0;i--)
        {
            c = word.charAt(0);
            s = s + c;
        
        }
        if(word.equals(s))
        {
            System.out.println("It is a palindrome");
            
        }
        else 
        {
            System.out.println("It is not a palindrome");
        }
    
}
}