class aeroplane{
    public void takeoff()
    {
        System.out.println("plane is taking off");
    }
    public void fly()
    {
        System.out.println("plane is flying");
    }
}
class CargoPlane
{
    public void takeoff()
    {
        System.out.println("plane1 is taking off");
    }
    public void fly()
    {
        System.out.println("plane1 is flying");
    }
}

class PassengerPlane
{
    public void takeoff()
    {
        System.out.println("plane2 is taking off");
    }
    public void fly()
    {
        System.out.println("plane2 is flying");
    }
}

class FighterPlane
{
    public void takeoff()
    {
        System.out.println("plane3 is taking off");
    }
    public void fly()
    {
        System.out.println("plane3 is flying");
    }
}

class Airport{
    public void polymorph(aeroplane ref)                 //POLYMORPHISM
    {
        ref.takeoff();
        ref.fly();
    }
}


public class polymorphism1 {
    public static void main(String[] args) {
        // PassengerPlane pp=new PassengerPlane();
        // CargoPlane cp=new CargoPlane();
        // FighterPlane fp=new FighterPlane();
        // Airport a=new Airport();
        // a.polymorph(cp);
        // a.polymorph(pp);
        // a.polymorph(fp);

        // pp.takeoff();
        // pp.fly();
        // fp.takeoff();
        // fp.fly();
        // cp.takeoff();
        // cp.fly();
        

    }
    
}
