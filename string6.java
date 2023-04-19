//case 1--> reversing a string

// public class string6 {
//     public static void main(String[] args) {
//         String s1="Computer";
//         String s2=" ";
//         for(int i=s1.length()-1;i>=0;i--)
//         {
//             s2=s2+s1.charAt(i);
//         }
//         System.out.println("before reversing: "+s1);
//         System.out.println("after reversing: "+s2);
//     }
// }


//case 2 --> interchanging the words

public class string6 {
    public static void main(String[] args) {
        String s1="Computer Science";
        String s2=" ";
        String arr[]=s1.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            s2=s2+arr[i]+" ";
        }
        System.out.println("before reversing: "+s1);
        System.out.println("after reversing: "+s2);
    }
}

