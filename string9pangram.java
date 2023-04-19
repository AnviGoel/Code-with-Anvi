// if a sentence is pangram or not is checked if it contains all alphabets from A to Z 

public class string9pangram {
    public static void main(String[] args) {
        String str1="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        str1.replace(" ", "");

        char []arr1=str1.toCharArray();
        int []ar1=new int[26];
        for(int i=0;i<arr1.length;i++)
        {
             ar1[arr1[i]-65]++;   
        }
        for(int i=0;i<ar1.length;i++)
        {
            if(ar1[i]==0)
            {
                System.out.println("it is not pangram");
            }
        }
        System.out.println("its pangram");

    }
}
