//Anonymous Inner Class

interface Car{
    void drive();
}
public class InnerClass3 {
    public static void main(String[] args) {
        Car obj=new Car() {
            
            public void drive()
            {
                System.out.println("driving..");
            }
        };
        obj.drive();
    }
}
