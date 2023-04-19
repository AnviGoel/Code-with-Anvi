// multiple classes can inherit the properties of other classes

class demo1{
    void disp()
    {
        System.out.println("demo1");
    }
}
class demo2 extends demo1{

}
class demo3 extends demo2{

}
public class MultiLevelInh {
    public static void main(String[] args) {
        demo3 obj=new demo3();
        obj.disp();
    }
    
}
