class aeroplane{
    void fly()
    {
        System.out.println("aeroplane flies!");
    }
    void takeOff()
    {
        System.out.println("aeroplane can takeoff real fast!");      //INHERITED METHOD
    }
}
class CargoPlane
    {
        void fly()               //OVERRIDDEN METHOD
        {
            System.out.println("overridden fly method");
        }
        void CarryGoods()              //SPECIALIZED METHOD
        {
            System.out.println("Cargo planes are used to carry goods");
        }
    }
class PassengerPlane {
    void fly()
        {
            System.out.println("overridden fly method");
        }
    void CarryPassenger()
        {
            System.out.println("Passenger planes are used to carry passengers");
        }
}

public class threetypesofmethod{
    public static void main(String[] args) {
        
    }
}
