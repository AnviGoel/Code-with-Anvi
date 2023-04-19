// class calc
// {
//     public int add(int x,int y)
//     {
//         int result = x+y;
//         return result;
//     }
// }


// public class array3anonymous {
//     public static void main(String[] args) {
//         calc obj = new calc();
//         int result = obj.add(5,7);
//         System.out.println(result);
//     }
    
// }


class calc
{
    public int add(int nums[])
    {
        int result = 0;
        for(int n : nums)
        {
            result=result+n;
        }
        return result;
    }
}


public class array3anonymous {
    public static void main(String[] args) {
        calc obj = new calc();
        int nums[]={3,5,7,2};
        int result = obj.add(nums);
        System.out.println(result);
    }
    
}