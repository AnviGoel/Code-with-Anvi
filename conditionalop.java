import java.util.Scanner;

public class conditionalop {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        age=sc.nextInt();
        if(age<=18)
        {
            System.out.println("You can not vote, you are underage");
        }
        else
        {
            System.out.println("You can vote!");
        }
    }
    
}
