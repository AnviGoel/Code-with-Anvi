//comparison of strings

public class string3 {
    public static void main(String[] args) {
        String s1="Anvi";
        String s2=new String("Anvi");
        System.out.println(s1==s2); //it compares if s1 and s2 are pointing to the same object or not
        System.out.println(s1.equals(s2)); //it compares if value stored in s1 and s2 are same or not
        
    }
}
