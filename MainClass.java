
/**
 * Write a description of class MainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass
{
    public static void main()
    {
        Apple apple_object = new Apple();
        
        System.out.println("The taste of apple = "+ apple_object.taste);
        System.out.println("The color of apple = "+ apple_object.color);
        
        Grape grape_object = new Grape();
        System.out.println("The taste of grape = "+ grape_object.taste);
        System.out.println("The color of grape = "+ grape_object.color);
        System.out.println("isBunch = "+ grape_object.isBunch);
        
    }
}
