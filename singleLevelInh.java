// the child class invokes the child class contructor in which super() is present which first invokes parent class constructor as soon as object of the class is created!

class animal{
    int age=19;
    animal()
    {
        System.out.println("parent class contructor");
    }
    public void caring()
    {
        System.out.println("animals are very cute!");
        System.out.println(age);
    }
}

class tiger extends animal{

}

public class singleLevelInh {
    public static void main(String[] args) {
        tiger obj=new tiger();
        obj.caring();
    }
}