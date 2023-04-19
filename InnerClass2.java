//static inner class


class A{
    void show()
    {
        System.out.println("in show");
    }
    static class B
    {
        void display()
        {
            System.out.println("in display");
        }
    }
}


public class InnerClass2 {
    public static void main(String[] args) {
        A obj=new A();
        A.B obj1=new A.B();
        obj.show();
        obj1.display();
    }
}
