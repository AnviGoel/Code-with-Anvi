import java.util.Scanner;

public class switchcase {
    
    public static void main(String[] args) {
        int a,b;
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("the choices given are: 1.ADD 2.SUBTRACT 3.MULTIPLY 4.DIV 5. MODULUS");
        System.out.println("enter your choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("the sum of a and b is "+ (a+b));
            break;
            case 2:
            System.out.println("the difference of a and b is "+ (a-b));
            break;
            case 3:
            System.out.println("the product of a and b is "+ (a*b));
            break;
            case 4:
            System.out.println("the div of a and b is "+ (a/b));
            break;
            case 5:
            System.out.println("the mod of a and b is "+ (a%b));
            break;
            default:
            System.out.println("enter valid choice");
            
        }
    }
    
}
