class parent{
    int age=19;
    public void caring()
    {
        System.out.println("parents are very caring");
        System.out.println(age);
    }
}

class child extends parent{

}

public class inheritancebasic {
    public static void main(String[] args) {
        child obj=new child();
        obj.caring();
    }
}
