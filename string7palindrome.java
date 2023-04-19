//palindrome string

public class string7palindrome {
    public static void main(String[] args) {
        String str1="madam";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        System.out.println("before reversing: "+str1);
        System.out.println("after reversing: "+str2);
        if(str1.equals(str2))
        {
            System.out.println(" is palindrome");
        }
        else
        {
            System.out.println(" not a palindrome");
        }
    }
}
