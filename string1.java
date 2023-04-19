//memory alloction of strings is
//if new keyword is used, the string gets stored in heap area outside string constant pool
//also if any reference is used or any inbuilt method is used, strings get stored in heap area
//otherwise when string is made, it gets stored in string constant pool (SCP) which cannot store duplicates

public class string1 {
    public static void main(String[] args) {
        String name="Anvi";
        System.out.println(name);
        name.concat("Goel");
        System.out.println(name);

        StringBuilder name1=new StringBuilder("Manvita");
        System.out.println(name1);
        name1.append(" Goel");
        System.out.println(name1);
    }
    
}
