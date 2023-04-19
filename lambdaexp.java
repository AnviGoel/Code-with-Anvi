//lambda expression works only on functional interface(only one abstract method)
//(parameter-list)--> {body}
//no parameter syntax ()--> {body}
//one parameter syntax p1--> {body}
//two parameter syntax (p1,p2)--> {body}

interface Car{
    void drive();
}
public class lambdaexp {
    public static void main(String[] args) {
        // Car obj= () --> System.out.println("driving..");
        // obj.drive();

        // Car obj= p1 --> System.out.println("driving..");
        // obj.drive();

        // Car obj= (p1,p2) --> System.out.println("driving..");
        // obj.drive();
    }
}

