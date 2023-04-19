//Mutable Strings
// In case of mutable strings the appended strings get attached to the previous string i.e. new string is not formed
// whereas in immutable strigs new string is formed and the reference should point to new object to see the difference.

public class string10 {
    public static void main(String[] args) {
        //StringBuffer sb="ANVI";     INVALID SYNTAX
        StringBuffer sb=new StringBuffer("Anvi");
        sb.append(" Goel");
        System.out.println(sb);
        
        //stringBuilder can also be used to create a mutable string object.
    }
}
