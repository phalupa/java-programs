/*
 * calculate the sideof a cube given the volume of the cube as input
 */

import java.io.*;
class SideCube
{
    public static void main ()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the volume of a cube");
        
        try 
        {
                
            double volume = Double.parseDouble(br.readLine());
            
            double side_of_cube=  Math.cbrt(volume);
            
            System.out.println("the value of a side of the cube is "+ side_of_cube);
        }
        catch ( NumberFormatException nfe)
        {
            System.out.println("Please enter only numbers, not characters");
            System.exit(-1);
        }
    }
}
