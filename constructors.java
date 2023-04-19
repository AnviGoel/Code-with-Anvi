//initialization and creating memory at the time of object creation
class Student{
     int age;
     String name;
    Student(int age, String name){
        this.age=age;
        this.name=name;
        System.out.println(age +" "+name);
    }
}
public class constructors {
    public static void main(String[] args) {}
        Student obj=new Student(19,"anvi");
        
}
