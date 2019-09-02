
/**
 * Write a description of class ConditionalStatemen_Bluej here.
 *      accept 3 sides of a triangle
 *      check whether it is a pythagorian triplet
 * @author phalguni
 * @version 24/8/2019
 */
public class ConditionalStatement_Bluej
{
    // instance variables - replace the example below with your own
    public static void main (String args[])
    {
        int side1=0;
        int side2=0;
        int side3=0;
        int side1_sq=0;
        int side2_sq=0;
        int side3_sq=0;
        
        
        System.out.println("enter the values for the three sides of a triangle");
        
        side1 = args[0].parseInt();
        
        
        side1_sq=side1*side1;
        side2_sq=side2*side2;
        side3_sq=side3*side3;
        
        if (  (side1_sq == side2_sq + side3_sq) || 
              (side2_sq == side1_sq + side3_sq) ||
              (side3_sq == side1_sq + side2_sq)
           )
           {
              System.out.println("the triangle is a pythagorian triplet");
           }
        else
        {
            System.out.println("the triangle is not a pythagorian triplet");
        }
    }
}
    