
/*
   *
 * Write a description of class ConditionalClass here.
 *      accept 3 sides of a triangle
 *      check whether it is a pythagorian triplet
 *      a*a = b*b + c*c || c*c = a*a + b*b || b*b = a*a + b*b
 * @author phalguni
 * @version 24/8/2019
 */

import java.io.*;

public class ConditionalClass
{
    // instance variables - replace the example below with your own
    public static void main()
    {
        int side1=0;
        int side2=0;
        int side3=0;

        InputStreamReader streamRead = new InputStreamReader(System.in);
        BufferedReader buffRead = new BufferedReader(streamRead);
        
        try 
        {
            System.out.println("enter value for side1 : ");
            side1 = Integer.parseInt(buffRead.readLine());
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Enter only numbers, not characters");
            System.exit(-1);
        }
        catch (Exception e)
        {
            System.out.println("Exception while entering the input : "+e);
            System.exit(-1);
        }            
        
        try 
        {
            System.out.println("enter value for side2 : ");
            side2 = Integer.parseInt(buffRead.readLine());
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Enter only numbers, not characters");
            System.exit(-1);
        }
        catch (Exception e)
        {
            System.out.println("Exception while entering the input : "+e);
            System.exit(-1);
        }            
        
        
        try 
        {
            System.out.println("enter value for side3 : ");
            side3 = Integer.parseInt(buffRead.readLine());
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Enter only numbers, not characters");
            System.exit(-1);
        }
        catch (Exception e)
        {
            System.out.println("Exception while entering the input : "+e);
            System.exit(-1);
        }            
        
        int side1_sq = side1 * side1;
        int side2_sq = side2 * side2;
        int side3_sq = side3 * side3;
        
        if (  ( side1_sq == ( side2_sq + side3_sq)) ||
              ( side2_sq == ( side3_sq + side1_sq)) ||
              ( side3_sq == ( side1_sq + side2_sq))
           )
           {
               System.out.println("The given three sides satisfy the pythagorian triplet");
            }
        else
        {
            System.out.println("The given three sides do not satisfy the pythagorian triplet");
        }
    }

}