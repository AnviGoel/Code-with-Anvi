//the shadowing problem is the problem in which local variable and insance variable has same name and this keyword has to be used to avoid confusion for the compiler
class Student{

    private int rollno;
    private  String name;
    public void set(int rollno, String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    public void show()
    {
        System.out.println(name+ " " +rollno);
    }
}

public class thiskeyword {
    public static void main(String[] args) {
        Student obj=new Student();
        // obj.set();
        // obj.show();
        obj.set(111, "anvi");
        obj.show();
    }
}
