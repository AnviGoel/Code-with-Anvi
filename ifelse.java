import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        num=sc.nextInt();
        
        if(num==0)
        {
            System.out.println("number entered is 0");

        }
        else if(num>=0 && num<10)
        {
            System.out.println("number entered is single digit");

        }
        else if(num>9 && num<100)
        {
            System.out.println("number entered is two digit");

        }
        else if(num>99 && num<1000)
        {
            System.out.println("number entered is three digit");

        }
        else{
            System.out.println("number is greater than 1000");
        }
    }
}
