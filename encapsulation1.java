
class Student{

    private int rollno;
    private  String name;
    public void set()
    {
        rollno=10355;
        name="Anvi";
    }
    public void show()
    {
        System.out.println(name+ " " +rollno);
    }
}

public class encapsulation1 {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.set();
        obj.show();

    }
}
