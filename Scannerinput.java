import java.util.Scanner;

public class Scannerinput  {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age=sc.nextInt();
        System.out.println("age is "+age);
        System.out.println("enter the radius");
        double rad=sc.nextDouble();
        System.out.println("area is "+(3.14*rad*rad));
        System.out.println("enter the name");
        String name=sc.next();
        System.out.println("the name is "+name);
        }

}