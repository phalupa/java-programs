import java.io.*;
class max_min
{
    public static void main () throws IOException
    {
        System.out.println("enter two numbers\n");
        
        InputStreamReader streamRead = new InputStreamReader(System.in);
        //BufferedReader buffRead = new BufferedReader(new StreamReader(System.in));
        BufferedReader buffRead = new BufferedReader(streamRead);
        int num1 = 0;
        int num2 = 0;
        
        try {
                num1 = Integer.parseInt(buffRead.readLine());
                num2 = Integer.parseInt(buffRead.readLine());
                if ( num1 > num2 ) {
                    System.out.println(num1+" is greater than "+ num2 ); 
                } else {
                    System.out.println(num2+" is greater than "+ num1 ); 
                }
        
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer value");
        } catch (Exception e) {
            System.out.println("Error encountered while processing " +e);
        }
    }
}
        
    