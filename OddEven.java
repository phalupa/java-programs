
/**
 * Write a description of class odd_even here.
 *
 * @author phalguni
 * @version 24/
 */
public class OddEven
{
    // instance variables - replace the example below with your own
    
    public static void main(String[] args)
    {
        // initialise instance variables
        int num = Integer.parseInt(args[0]);
        System.out.println("enter a number");
        if (num%2==0)
        {
            System.out.println("even number");
        }
        else 
            System.out.println("odd number");
    }
}      

