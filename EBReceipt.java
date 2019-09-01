
/**
 * Write a description of class EBReceipt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EBReceipt
{
   public static void main(String name,long consNum,int units)
   {
       double charge = 0.0;
       
       if (units <= 100)
        {
           charge = 4.80 * 100;
        }
       else if (units >100 && units <=300)
        {
            charge = (4.80 * 100) + (units - 100)* 5.50 ;
        }
        else if(units > 300 && units <= 600 )
        {
            charge = (4.80 * 100) + ( 5.50 *200) + (units -300)*6.80;
        }
        else if( units > 600)
        {
            charge = (4.80 * 100) + (5.50 * 200) + ( 6.80 * 300)+ (units - 600) *7.50;
        }
         System.out.println("The West Bengal Electricity Board/n");
         System.out.println(" Money Receipt");
         System.out.println("Consumer Name - "+name);
         System.out.println(" Consumer Number - "+consNum);
         System.out.println(" The Amount To Be Paid - "+charge);
   }
    
}
