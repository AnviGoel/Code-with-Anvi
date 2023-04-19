class Student{
    private int sapid;
    private String name;

    public Student()
    {
        System.out.println("default constructor");
        name="anvi";
        sapid=500096926;
    }

    public Student(int sapid)
    {
        System.out.println("Single parameterized constructor");
        name="anvi";
        this.sapid=sapid;
    }

    public Student(int sapid,String name)
    {
        System.out.println("double parameterized constructor");
        this.name=name;
        this.sapid=sapid;
    }
    public void display()
    {
        System.out.println(name);
        System.out.println(sapid);
        
    }
}

public class constructoroverloading {
   
    public static void main(String[] args) {
        Student obj1=new Student();
        obj1.display();
        Student obj2=new Student(500094777);
        obj2.display();
        Student obj3=new Student(500096946,"manvita");
        obj3.display();
        
    }
}
