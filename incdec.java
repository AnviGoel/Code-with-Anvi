public class incdec {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println(a++);
        System.out.println(b++);
        System.out.println(++a);
        System.out.println(++b);
        b=a++ - ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
