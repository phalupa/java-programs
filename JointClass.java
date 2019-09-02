
/**
 * Write a description of class JointClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JointClass
{
 public static void main()
 {
     Car car_object=new Car();
     
     System.out.println("the color of car ="+car_object.color);
     System.out.println("the number of wheels of car ="+car_object.numWheels);
     System.out.println("the car has gear ="+car_object.hasGear);
     
     Bus bus_object=new Bus();
     
     System.out.println("the color of bus ="+bus_object.color);
     System.out.println("the number of wheels of bus ="+bus_object.numWheels);
     System.out.println("the bus has gear ="+bus_object.hasGear);
     
     Bike bike_object=new Bike();
     
     System.out.println("the color of bike ="+bike_object.color);
     System.out.println("the number of wheels of bike ="+bike_object.numWheels);
     System.out.println("the car has gears ="+bike_object.hasGear);
    }
}
     