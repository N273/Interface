package Prctice_Abstraction_Interface;
// if any class has a abstract method then we need to declare that class as an abstract class .
abstract class AbstractClass_Vehicle {
    // A method with out body is known as abstract method.
   abstract void start();
}
//  Any class extends the abstract (vehicle class) class then you need to create abstract class's body .
class car extends AbstractClass_Vehicle{
    void start ()
    {
        System.out.println(" car starts with keys");
    }
}
class scooter extends AbstractClass_Vehicle{
    void start()
    {
        System.out.println("scooter starts with kick");
    }


public static void main(String[]arg){
    // we can not create an object for the abstract class (Vehicle)
       car c = new car();
       c.start();
       scooter s = new scooter();
       s.start();
}

}