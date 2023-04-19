import java.util.*;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of students");
        int stu=sc.nextInt(0);
        System.out.println("enter number of classes");
        int classes=sc.nextInt(0);

        int arr[][]=new int[classes][stu];
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("enter marks of student");
                arr[i][j]=sc.nextInt();
            }
        }

    }
    
}
