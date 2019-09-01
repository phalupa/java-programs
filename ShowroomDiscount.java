
/**
 * Write a description of class ShowroomDiscount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShowroomDiscount
{
    public static void main(double tot_Cost)
    {
        double amt_paid=0.0;
        String gift ="";
        
        if( tot_Cost >= 1000 && tot_Cost <= 2000 )
        {
         amt_paid = tot_Cost - (0.05 * tot_Cost);
         gift = "CALCULATOR";
        }
        else if( tot_Cost >= 2001 && tot_Cost <= 5000 )
        {
           amt_paid = tot_Cost - (0.1 * tot_Cost);
           gift = "SCHOOL BAG";
        }
        else if( tot_Cost >= 5001 && tot_Cost <= 10000 )
        {
            amt_paid = tot_Cost - (0.15 * tot_Cost);
            gift = "WALL CLOCK";
        }
        else if( tot_Cost > 10000 )
        {
            amt_paid = tot_Cost - (0.2* tot_Cost);
            gift = "WRIST WATCH";
        }
        System.out.println("the amount to be paid is "+ amt_paid);
        System.out.println("the gift is a "+gift);
    }

}
