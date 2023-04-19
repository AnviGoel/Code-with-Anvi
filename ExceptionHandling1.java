public class ExceptionHandling1 {
    public static void main(String[] args) {
        int num1=6;
        int num2=0;
        int result = 0;
        int values[]={4,5,6,7};
        String name=null;
        try{
            result=num1 / name.length();
            System.out.println(values[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cant divide by zero " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("out of the array limits!");
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }

        System.out.println(result);
        System.out.println("bye");
        
    }
}
