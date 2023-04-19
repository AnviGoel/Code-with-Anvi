//CONDITIONS TO OVERRIDE A METHOD IN CHILD CLASS:
//1.THE SCOPE OF METHOD MAY INCREASE OR REMAIN SAME BUT CANNOT DECREASE
//2.THE DATATYPE SHOULD BE SAME IN BOTH METHIDS
//3.THE PARAMETERS SHOULD BE SAME OTHERWISE METHOD OVERLOADING WILL COME IN THE SCENARIO.


class Animal{
    public void eat()
    {
        System.out.println("animals eat");
    }
}
class Tiger extends Animal{
 
    // private int eat(){

    // }
}


public class methodoverriding {
    public static void main(String[] args) {
        Tiger obj=new Tiger();
        obj.eat();
    }
}
